package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/22
 */
public class TestLabelWhileLooper {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            System.out.println("outer while loop");
            inner:
            while (true) {
                i++;
                System.out.println("inner while loop");
                System.out.println("i=" + i);
                if (i == 1) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    System.out.println("break");
                    break;
                }
                if (i == 7) {
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }
}
