package com.tstar.basic;

import java.util.Scanner;

public class ComputeAreaWIthConsoleInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a radius
		System.out.print("Enter a number of radius:");
		Double radius = input.nextDouble();
		
		// Compute area
		Double area = radius * radius * Math.PI;
		
		// Display results
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}

}
