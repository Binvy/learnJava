package com.book.thinkinginjava.basic;

/**
 * @comments: pirntf() format()
 * @author: binvy
 * @Date: 2018/3/7
 */
public class SimplePrintf {
    public static void main(String[] args) {
        int x = 520;
        double y = 3.1415926;
        // The old way
        System.out.println("Row 1: [" + x + " " + y + "]");
        // The new way
        System.out.format("Row 1: [%d %f]", x, y);
        System.out.println();
        // or
        System.out.printf("Row 1: [%d %f]", x, y);
    }
}
