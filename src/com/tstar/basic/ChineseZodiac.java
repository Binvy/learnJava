package com.tstar.basic;

import java.util.Scanner;

public class ChineseZodiac {

	/**
	 * check a year is which year in chinese zodiac
	 */
	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);
		// prompt user enter a year
		System.out.println("enter a year number for check: ");
		// get the input number
		int number = input.nextInt();
		// check the number is which chinese zodiac
		String zodiac = "";
		switch (number % 12) {
		case 0: zodiac = "monkey"; break;
		case 1: zodiac = "rooster"; break;
		case 2: zodiac = "dog"; break;
		case 3: zodiac = "pig"; break;
		case 4: zodiac = "rat"; break;
		case 5: zodiac = "ox"; break;
		case 6: zodiac = "tiger"; break;
		case 7: zodiac = "rabbit"; break;
		case 8: zodiac = "dragon"; break;
		case 9: zodiac = "snake"; break;
		case 10: zodiac = "horse"; break;
		case 11: zodiac = "goat"; break;
		default: 
			System.out.println("invalid number");
			break;
		}
		System.out.println("this year is a year of " + zodiac);
	}

}
