package com.book.thinkinginjava.basic;

import java.util.Random;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/2
 */
public class RandomDoubles {
    private static Random random = new Random(47);
    public double next() {
        return random.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles randomDoubles = new RandomDoubles();
        for ( int i = 0; i < 7; i++ ) {
            System.out.println(randomDoubles.next() + " ");
        }
    }
}
