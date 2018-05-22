package com.book.thinkinginjava.collection;

/**
 * @comments: 位运算符
 * @author: binvy
 * @Date: 2018/5/22
 */
public class BitTest {
    public static void main(String[] args) {
        System.out.println("1 << 2 " + (1 << 2));
        System.out.println("2 << 3 " + (2 << 3));

        System.out.println("8 >> 2 " + (8 >> 2));
        System.out.println("16 >> 3 " + (16 >> 3));

        System.out.println("64 >>> 3 " + (64 >>> 3));

        System.out.println("3 | 2 " + (3 | 2));
        System.out.println("2 | 3 " + (2 | 3));
        System.out.println("3 ^ 2 " + (3 ^ 2));
        System.out.println("2 ^ 3 " + (2 ^ 3));
        System.out.println("2 ^ 2 " + (2 ^ 2));
        System.out.println("3 ^ 3 " + (3 ^ 3));
        System.out.println("3 & 2 " + (3 & 2));
        System.out.println("3 & 3 " + (3 & 3));
        System.out.println("2 & 3 " + (2 & 3));
        System.out.println("~3 " + (~3));
        System.out.println("~2 " + (~2));
        System.out.println("~1 " + (~1));




    }
}
