package com.tstar.basic;

import java.util.Scanner;

public class DisplayTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.print("Please enter an integer for seconds: ");
		int seconds = input.nextInt();
		
		// Compute time
		int minutes = seconds / 60;
		int remaingSeconds = seconds % 60;
		
		// Display results
		System.out.println("the seconds: " + seconds + " is " + minutes + " minutes " + remaingSeconds + " seconds!");
	}

}
