package com.book.thinkinginjava.basic;

import java.util.Random;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/21
 */
public class TestRandomSeed {
    public static void randomWithSeed() {
        //Seed：种子，用于随机数生成器的初始化值，随机数生成器对于特定的种子值总是产生相同的随机数序列
        Random random = new Random(1);
        for ( int i = 0; i < 100; i++ ) {
            System.out.print(random.nextInt() + " ");
        }
    }

    public static void randomWithoutSeed() {
        Random random = new Random();
        for ( int i = 0; i < 100; i++ ) {
            System.out.print(random.nextInt() + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("**************带种子的随机生成数**************");
        randomWithSeed();
        System.out.println();
        System.out.println("**************不带种子的随机生成数***************");
        randomWithoutSeed();
    }
}
