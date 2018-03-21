package com.book.thinkinginjava.classInfo;

/**
 * @comments: Class对象的一些方法
 * @author: binvy
 * @Date: 2018/3/21
 */
public class ToyTest {
    public static void printInfo(Class c) {
        System.out.println("Class Name:" + c.getName());
        System.out.println("Simple Name:" + c.getSimpleName());
        System.out.println("Canonical Name:" + c.getCanonicalName());
        System.out.println("Is interface:" + c.isInterface());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.book.thinkinginjava.classInfo.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(c);
        for ( Class face : c.getInterfaces() ) {
            printInfo(face);
        }
        Class o = c.getSuperclass();
        Object object = null;
        try {
            object = o.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(object.getClass());
    }
}

interface HasBatteries { }
interface WaterProof { }
interface Shoots { }
class Toy {
    Toy() { }
    Toy(int i) { }
}
class FancyToy extends Toy implements HasBatteries, WaterProof, Shoots {
    FancyToy() { super(1);}
}
