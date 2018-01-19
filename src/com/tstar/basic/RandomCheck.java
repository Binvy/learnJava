package com.tstar.basic;

import java.util.Scanner;

public class RandomCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Make two random numbers
		int number1 = (int)( Math.random() * 10);
		int number2 = (int)( Math.random() * 10);
		
		// check number1 > number2
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// prompt user enter the answer
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2);
		int result = input.nextInt();
		
		if (result == number1 - number2) {
			System.out.println("You are correct!");
		}
		else {
			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
		}
	}

}
