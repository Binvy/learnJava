package com.book.thinkinginjava.basic;

import com.tstar.basic.RandomCharacter;

import java.util.Random;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/22
 */
public class TestSwitchLooper {
    public static void main(String[] args) {
        Random random = new Random();
        for ( int i = 0; i < 100; i++ ) {
            int k = random.nextInt(26);
            System.out.println(k + "\t");
            int c = k + 'a';
            System.out.println((char)c + "," + c + ";");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'o':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes a vowel");
                    default:
                        System.out.println("consonant");
            }
        }
    }
}
