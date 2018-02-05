package com.tstar.basic;

import java.util.Scanner;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/6 0006
 */
public class ComputeFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int i = input.nextInt();
        System.out.println("The Fibonacci number at index " + i + " is: " + fib(i));
    }

    private static int fib(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }
}
