package com.book.thinkinginjava.basic;

import com.tstar.basic.RandomCharacter;

import java.util.Random;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/22
 */
public class TestForEachLooper {
    public static void main(String[] args) {
        Random random = new Random();
        float[] f = new float[10];
        for ( int i = 0; i < 10; i++ ) {
            f[i] = random.nextFloat();
        }
        for ( float ft : f) {
            System.out.print(ft + "\t");
        }

        String s = "Hello World!";
        for ( char c: s.toCharArray()
               ) {
            System.out.print(c + " ");
        }

    }
}
