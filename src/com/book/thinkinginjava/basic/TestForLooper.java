package com.book.thinkinginjava.basic;

/**
 * @comments: Demonstrates "for" loop by listing
 * @author: binvy
 * @Date: 2018/2/22
 */
public class TestForLooper {
    public static void main(String[] args) {
        for ( char c = 0; c < 128; c++ ) {
            if (Character.isLowerCase(c)) {
                System.out.println("value: " + (int)c + " character: " + c);
            }
        }

        // 逗号操作符
        for ( int i = 0, j = 10; i < 5; i++, j = i * 2) {
            System.out.println("i:" + i + " j:" + j);
        }

    }
}
