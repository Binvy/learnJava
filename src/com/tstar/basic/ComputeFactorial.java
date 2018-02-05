package com.tstar.basic;

import java.util.Scanner;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/6 0006
 */
public class ComputeFactorial {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);
        // Prompt enter an integer
        System.out.println("enter a number:");
        int i = input.nextInt();
        System.out.println("The factorial of " + i + " is: " + factorial(i));

    }

    private static int factorial(int i) {
        // Base case
        if (i == 0) {
            return 1;
        } else {
            // Recursive call
            return i * factorial(i - 1);
        }
    }
}
