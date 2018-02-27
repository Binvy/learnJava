package com.book.thinkinginjava.basic;

import javax.swing.text.html.Option;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/27
 */
public class TestVarArgs {
    public static void main(String[] args) {
        VarArgs.printArray(new Object[]{"one", "two", "three"});
        VarArgs.printArray(new Object[]{new Integer(1), new Integer(2), 3, "4"});

        NewVarArgs.printArray(new Object[]{"one", "two", "three", "four"});
        NewVarArgs.printArray(new Object[]{new Integer(1), new Integer(2), 3, "4"});
        NewVarArgs.printArray();

        OptionalTrailingArgs.f(0);
        OptionalTrailingArgs.f(1, new String[] {"Hello", " ", "World", "!"});
        OptionalTrailingArgs.f(2,  "are", " you", " ok?");

        VarArgsType.f('a', 'b');
        VarArgsType.f();
        VarArgsType.g(1, 2);
        VarArgsType.g();
        VarArgsType.g(new Integer(123));
        VarArgsType.h(1, 2);

        OverloadingVarArgs.f('o', 'v', 'e', 'r', 'l', 'o', 'a', 'd', 'i', 'n', 'g');
        OverloadingVarArgs.f(2,1);
        OverloadingVarArgs.f(2);
        OverloadingVarArgs.f('3');
        OverloadingVarArgs.f(2L);

        OverloadingVarArgs2.f('a', 'b');
        OverloadingVarArgs2.f(1,'b');

    }
}

/**
 * 用数组句法创建可选参数列表
 */
class VarArgs {
    static void printArray(Object[] objects) {
        for ( Object object : objects) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}

/**
 * 从Java SE5开始起
 */
class NewVarArgs {
    static void printArray(Object... args) {
        for ( Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}

/**
 * 具有可选的尾随参数
 */
class OptionalTrailingArgs {
    static void f(int required, String... trailing) {
        System.out.print("required: " + required + " ");
        for ( String s : trailing ) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

/**
 * 可变参数列表为数组，如果该列表中没有任何元素，那么转变为的数据的尺寸为0
 * 可变参数列表不依赖自动包装机制，而实际上使用的是基本类型
 */
class VarArgsType {
    static void f(Character... characters) {
        System.out.print(characters.getClass());
        System.out.println(" length:" + characters.length);
    }

    static void g(int... ints) {
        System.out.print(ints.getClass());
        System.out.println(" length:" + ints.length);
    }

    static void h(Integer... integers) {
        System.out.print(integers.getClass());
        System.out.println(" length:" + integers.length);
    }
}

/**
 * 可以在单一的参数列表中将类型混合在一起，而启动包装机制将有选择地将参数类型进行提升，如int类型提升为Integer...
 */
class OverloadingVarArgs {
    static void f(Character... characters) {
        System.out.print("first");
        for ( Character c: characters
               ) {
            System.out.print(" " + c);
        }
        System.out.println();
    }

    static void f(Integer... integers) {
        System.out.print("second");
        for ( Integer i: integers
               ) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    static void f(Long... longs) {
        System.out.print("third");
        for ( Long l: longs
               ) {
            System.out.print(" " + l);
        }
        System.out.println();
    }
}

/**
 * {CompileTimeError} Won't compile
 * 给两个方法都添加一个非可变参数，就可以解决问题了
 */
class OverloadingVarArgs2 {
    static void f(int i, Character... characters) {
        System.out.println("first");
    }
    /* 编译器的自动包装机制，导致发生了对f的引用不明确， */
    /*static void f(Character... characters) {
        System.out.println("second");
    }*/

    static void f(char c, Character... characters) {
        System.out.println("second");
    }
}