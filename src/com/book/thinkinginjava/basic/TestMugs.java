package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/27
 */
public class TestMugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    TestMugs() {
        System.out.println("Mugs()");
    }
    TestMugs(int marker) {
        System.out.println("Mugs(" + marker + ")");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new TestMugs();
        System.out.println("new Mugs() completed");
        new TestMugs(2);
        System.out.println("new Mugs(int marker) completed");
    }

}

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}
