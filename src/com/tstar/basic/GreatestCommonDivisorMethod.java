package com.tstar.basic;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		// Prompt user enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		// Display the result
		System.out.println("The greatest common divisor of " + 
			n1 + " and " + n2 + " is " + gcd(n1, n2));
		
	}
	
	/* Return the gcd of two integers */
	public static int gcd(int a, int b) {
		int gcd = 1;
		int k = 2;
		while (k <= a && k <= b) {
			if (a % k == 0 && b % k == 0) {
				gcd = k;
			}
			k++;
		}
		return gcd;
	}

}
