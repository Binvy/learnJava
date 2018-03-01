package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/1
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSup sup = new StaticSub();
        sup.dynamicGet();
        sup.staticGet();

    }
}

class StaticSup {
    public static void staticGet() {
        System.out.println("StaticSup staticGet()");
    }
    public void dynamicGet() {
        System.out.println("StaticSup dynamicGet()");
    }
}

class StaticSub extends StaticSup {
    public static void staticGet() {
        System.out.println("StaticSub staticGet()");

    }
    @Override
    public void dynamicGet() {
        System.out.println("StaticSub dynamicGet()");
    }
}

