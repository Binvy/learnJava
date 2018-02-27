package com.book.thinkinginjava.basic;
//: book/thinkinginjava/basic/TestPrintStream.java
import java.util.Date;

/** The first Thinking in Java example program.
 * Display a string and today's date.
 * @comments: System class
 * @author: binvy
 * @Date: 2018/2/21
 * @version: 4.0
 */
public class TestPrintStream {
    /**
     * Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
        System.out.println("**************************");

        //获取当前的系统属性，并将属性列表输出到指定的输出流
        System.getProperties().list(System.out);
        System.out.println("**************************");

        //获取指定键指示的系统属性
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        System.out.println("**************************");
    }

}
/* Output: (55% match)
 Hello, it's:
 Wed Feb 21 16:41:02 GMT+08:00 2018
 *///:~
