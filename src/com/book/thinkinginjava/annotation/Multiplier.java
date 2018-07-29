package com.book.thinkinginjava.annotation;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/7/29
 */
@ExtractInTerface("IMultiplier")
public class Multiplier {
    public int multiply(int x, int y) {
        int result = 0;
        for ( int i = 0; i < x; i++ ) {
            result = add(result, y);
        }
        return result;
    }
    private static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        System.out.println("11 * 16 = " + multiplier.multiply(11, 16));
    }
}
