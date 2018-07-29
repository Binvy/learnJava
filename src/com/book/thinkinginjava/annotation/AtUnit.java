package com.book.thinkinginjava.annotation;

import com.book.thinkinginjava.io.BinaryFile;
import com.book.thinkinginjava.io.ProcessFiles;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/7/29
 */
public class AtUnit implements ProcessFiles.Strategy {
    static Class<?> testClass;
    static List<String> failedTests = new ArrayList<String>();
    static long testsRun = 0;
    static long failures = 0;
    public static void main(String[] args) throws Exception{
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
        new ProcessFiles(new AtUnit(), "class").start(args);
        if (failures == 0) {
            System.out.print("OK (" + testsRun + " tests)");
        } else {
            System.out.print("(" + testsRun + " tests)");
            System.out.print("\n >>>" + failures + " FAILURE" + (failures > 1 ? "5" : "") + " <<<");
            for ( String failed : failedTests
                   ) {
                System.out.print("\t" + failed);
            }
        }
    }
    @Override
    public void process(File cFile) {
        try {
            String cName = ClassNameFinder.thisClass(BinaryFile.read(cFile));
            if (!cName.contains(".")) {
                return;
            }
            testClass = Class.forName(cName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        TestMethods testMethods = new TestMethods();
        Method creator = null;
        Method cleanup = null;
        for (Method method : testClass.getDeclaredMethods()) {
            testMethods.addIfTestMethod(method);
            if (creator == null) {
                creator = checkForCreatorMethod(method);
            }
            if (cleanup == null) {
                cleanup = checkForCleanupMethod(method);
            }
        }
        if (testMethods.size() > 0) {
            if (creator == null) {
                try {
                    if (!Modifier.isPublic(testClass.getDeclaredConstructor().getModifiers())) {
                        System.out.println("Error " + testClass + " default constructor must be public");
                        System.exit(1);
                    }
                }catch (NoSuchMethodException e) {
                    // Synthesized default constructor: OK
                }
                System.out.println(testClass.getName());
            }

            for ( Method method : testMethods
                   ) {
                System.out.println("    .   " + method.getName() + "    ");
                try {
                    Object testObject = createTestObject(creator);
                    boolean success = false;
                    try {
                        if (method.getReturnType().equals(boolean.class)) {
                            success = (Boolean)method.invoke(testObject);
                        } else {
                            method.invoke(testObject);
                            success = true; // If no assert fails
                        }
                    }catch (InvocationTargetException e) {
                        System.out.println(e.getCause());
                    }
                    System.out.println(success ? "" : "(failed)");
                    testsRun++;
                    if (!success) {
                        failures++;
                        failedTests.add(testClass.getName() + " " + method.getName());
                    }
                    if (cleanup != null) {
                        cleanup.invoke(testObject, testObject);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class TestMethods extends ArrayList<Method> {
        void addIfTestMethod (Method method) {
            if (method.getAnnotation(Test.class) == null) {
                return;
            }
            if (method.getReturnType().equals(boolean.class) || method.getReturnType().equals(void.class)) {
                throw new RuntimeException("@Test method must return boolean or void " );
            }
            // In case it's private. etc.
            method.setAccessible(true);
            add(method);
        }
    }

    private static Method checkForCreatorMethod(Method method) {
        if (method.getAnnotation(TestObjectCreate.class) == null) {
            return null;
        }
        if (!method.getReturnType().equals(testClass)) {
            throw new RuntimeException("@TestObjectCreate must return instance of Class to be created");
        }
        if ((method.getModifiers()&Modifier.STATIC) <  1) {
            throw new RuntimeException("@TestObjectCreate must be static");
        }
        method.setAccessible(true);
        return method;
    }

    private static Method checkForCleanupMethod(Method method) {
        if (method.getAnnotation(TestObjectCleanup.class) == null) {
            return null;
        }
        if (!method.getReturnType().equals(void.class)) {
            throw new RuntimeException("@TestObjectCleanup must return void");
        }
        if ((method.getModifiers() & Modifier.STATIC) < 1) {
            throw new RuntimeException("@TestObjectCleanup must be static");
        }
        if (method.getParameterTypes().length == 0 || method.getParameterTypes()[0] != testClass) {
            throw new RuntimeException("@TestObjectCleanup must take an argument of the tested type");
        }
        method.setAccessible(true);
        return method;
    }

    private static Object createTestObject(Method creator) {
        if (creator != null) {
            try {
                return creator.invoke(testClass);
            } catch (Exception e) {
                throw new RuntimeException("Couldn't run @TestObject (creator) method.");
            }
        } else {
            try {
                return testClass.newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Couldn't create a test Object, Try using a @TestObject method.");
            }
        }
    }
}
