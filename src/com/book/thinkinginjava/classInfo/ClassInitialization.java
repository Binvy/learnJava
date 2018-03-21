package com.book.thinkinginjava.classInfo;

import java.util.Random;

/**
 * @comments: 类字面常量
 * @author: binvy
 * @Date: 2018/3/21
 */
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.staticFinal);
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNotFinal);
        try {
            Class initable3 = Class.forName("com.book.thinkinginjava.classInfo.Initable3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNotFinal);
    }
}

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNotFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNotFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}
