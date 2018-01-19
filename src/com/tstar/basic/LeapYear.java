package com.tstar.basic;

import java.util.Scanner;

public class LeapYear {

	/**
	 * if(year % 4 ==0 && year % 100 != 0) || (year % 400 == 0) it's a leapyear 
	 */
	public static void main(String[] args) {
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		// prompt user enter a year number
		System.out.print("Enter a year number: ");
		// get the input
		int number = input.nextInt();
		// check the number is a leapyear or not
		boolean isLeapYear = (number % 4 == 0 && number % 100 != 0) || (number % 400 == 0);
		// display the result
		System.out.println("the year " + number + " is a leapyear is: " + isLeapYear);
	}

}
