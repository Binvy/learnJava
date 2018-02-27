package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/22
 */
public class TestThisConstructor {
    int age = 0;
    String name = "lily";
    TestThisConstructor(int age) {
        this.age = age;
        System.out.println("Constructor with int args:" + age);
    }
    TestThisConstructor(String name) {
        this.name = name;
        System.out.println("Constructor with string args:" + name);
    }
    TestThisConstructor(String name, int age) {
        this(age);
        this.name = name;
        System.out.println("String args & int args");
    }

    TestThisConstructor() {
        System.out.println("default constructor (no args)");
    }

    void love() {
        System.out.println("Hello, " + name + ",I miss u " + age );
    }

    public static void main(String[] args) {
        TestThisConstructor lily = new TestThisConstructor("Lily", 1125);
        lily.love();
    }

}
