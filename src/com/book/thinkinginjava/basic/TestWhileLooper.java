package com.book.thinkinginjava.basic;

/**
 * @comments: Demonstrates the while loop
 * @author: binvy
 * @Date: 2018/2/22
 */
public class TestWhileLooper {
    static boolean condition() {
        boolean result = Math.random() < 0.9;
        System.out.println(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside 'While'");
        }
        System.out.println("Exited 'While'");
    }
}
