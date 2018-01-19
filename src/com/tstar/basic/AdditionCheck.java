package com.tstar.basic;

import java.util.Scanner;

public class AdditionCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// make two random numbers
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user enter result
		System.out.print("Enter the result of: " + number1 + " + " + number2);
		int result = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " = " + result + " is " + (number1 + number2 == result));
		
		
	}

}
