package com.book.thinkinginjava.basic;

import com.tstar.basic.RandomCharacter;

import java.util.Arrays;
import java.util.Random;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/27
 */
public class TestArrayInitialization {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2;
        a2 = a1;
        for ( int i = 0; i < a2.length; i++ ) {
            a2[i] += 1;
        }
        System.out.println(Arrays.toString(a1));

        //1 way of array autoBoxing
        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        System.out.println(a.length);
        for ( int i = 0; i < a.length; i++ ) {
            a[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(a));

        //2 way of array autoBoxing
        Integer[] a3 = {new Integer(1), new Integer(2), 3 };
        System.out.println(Arrays.toString(a3));

        //3 way of array autoBoxing
        Integer[] a4 = new Integer[]{new Integer(1), new Integer(2), 3 };
        System.out.println(Arrays.toString(a3));

    }
}
