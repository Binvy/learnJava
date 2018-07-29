package com.book.thinkinginjava.annotation;

import com.book.thinkinginjava.io.BinaryFile;
import com.book.thinkinginjava.io.ProcessFiles;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;

/**
 * @comments: 移除测试代码
 * @author: binvy
 * @Date: 2018/7/29
 */
public class AtUnitRemover implements ProcessFiles.Strategy {
    private static boolean remove = false;

    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("-r")) {
            remove = true;
            String[] nargs = new String[args.length - 1];
            System.arraycopy(args, 1, nargs, 0, nargs.length);
            args = nargs;
        }
        new ProcessFiles(new AtUnitRemover(), "class").start(args);
    }
    @Override
    public void process(File file) {
        boolean modified = false;
        try {
            String name = ClassNameFinder.thisClass(BinaryFile.read(file));
            if (!name.contains(".")) {
                return;
            }
            ClassPool pool = ClassPool.getDefault();
            CtClass ctClass = pool.get(name);
            for (CtMethod method : ctClass.getDeclaredMethods()) {
                MethodInfo mi = method.getMetodInfo();
                AnnotationAttribute attr = (AnnotationAttribute)mi.getAttribute(AnnotationAttribute.visiableTag);
                if (attr == null) {
                    continue;
                }
                for ( Annotation annotation : attr.getAnnotations()
                       ) {
                    if (annotation.getTypeName().startWith("net.mindview.atunit")) {
                        System.out.println(ctClass.getName() + " Method " + mi.getName() + " " + annotation);
                        if (remove) {
                            ctClass.removeMethod(method);
                            modified = true;
                        }
                    }
                }
            }
            // Field are not removed in this version(see text)
            if (modified) {
                ctClass.toBytecode(new DataOutputStream(new FileOutputStream(file)));
            }
            ctClass.detach();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
