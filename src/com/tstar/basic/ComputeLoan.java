package com.tstar.basic;

import java.util.Scanner;

public class ComputeLoan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create a Scanner obj
		Scanner input = new Scanner(System.in);
		
		// Prompt user enter the annualInterestRate
		System.out.print("Enter annual interest rate, e.g., 5.75%: ");
		double annualInterestRate = input.nextDouble();
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Prompt user enter number of years
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		
		// Enter loan amount
		System.out.print("Enter loan amount, e.g., 12000.95: ");
		double amount = input.nextDouble();
		
		// Calculate payment
		double monthlyPayment = amount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * 12 * numberOfYears;
		
		// Display results
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
		
		
	}

}
