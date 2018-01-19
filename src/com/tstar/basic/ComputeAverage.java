package com.tstar.basic;

import java.util.Scanner;

public class ComputeAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user enter three number
		System.out.print("Please enter three number: ");
		Double number1 = input.nextDouble();
		Double number2 = input.nextDouble();
		Double number3 = input.nextDouble();
		
		// Compute average
		Double average = (number1 + number2 + number3) / 3;
		
		// Display results
		System.out.println("The arevage of " + number1 + " " + number2 + " " + number3 + " is: " + average);
	}

}
