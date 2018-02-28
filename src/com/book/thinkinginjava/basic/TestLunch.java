package com.book.thinkinginjava.basic;

/**
 * @comments: 指定构造器为private，组织别人通过构造器创建该类的对象
 * @author: binvy
 * @Date: 2018/2/28
 */
public class TestLunch {
    public static void main(String[] args) {
        //Soup1 soup1 = new Soup1();

        Soup1 soup1 = Soup1.makeSoup1();
        soup1.drinkSoup1();

        Soup2 soup2 = Soup2.makeSoup2();
        soup2.drinkSoup2();

    }
}

class Soup1 {
    private Soup1() {}
    public static Soup1 makeSoup1() {
        return new Soup1();
    }
    public void drinkSoup1() {
        System.out.println("I like soup1");
    }
}

class Soup2 {
    private Soup2() {}
    private static Soup2 soup = new Soup2();
    public static Soup2 makeSoup2() {
        return soup;
    }
    public void drinkSoup2() {
        System.out.println("I like soup2!");
    }
}
