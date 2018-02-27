package com.book.thinkinginjava.basic;

/**
 * @comments: 成员初始化
 * @author: binvy
 * @Date: 2018/2/23
 */
public class TestInitialValues {
    boolean bl;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    String str;
    TestInitialValues testInitialValues;

    void printValue() {
        System.out.println("Data type    Initial value");
        System.out.println("bollean     " + bl);
        System.out.println("char       [" + c + "]");
        System.out.println("byte        " + b);
        System.out.println("short       " + s);
        System.out.println("int         " + i);
        System.out.println("long        " + l);
        System.out.println("float       " + f);
        System.out.println("double      " + d);
        System.out.println("String      " + str);
        System.out.println("TestInitialValues" + testInitialValues);
    }

    public static void main(String[] args) {
        TestInitialValues testInitialValues = new TestInitialValues();
        testInitialValues.printValue();
        // = new TestInitialValues().printValue();
    }
}

