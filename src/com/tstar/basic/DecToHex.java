package com.tstar.basic;

import java.util.Scanner;

public class DecToHex {

	/**
	 * Decimal swap th Hex
	 */
	public static void main(String[] args) {
		// Create a scanner obj
		Scanner input = new Scanner(System.in);
		// Prompt user enter a decimal number
		System.out.println("Enter a decimal integer: ");
		int dec = input.nextInt();
		
		// Conver decimal to hex and display on the console
		System.out.println("The hex value for the decimal " + dec + " is " + DecToHex(dec));
	}
	
	public static String DecToHex(int dec) {
		String hex = "";
		while (dec != 0) {
			int hexValue = dec % 16;
			// Conver a decimal value to a hex digit
			char hexDigit = (hexValue <= 9 && hexValue >= 0) ? (char)(hexValue + '0') : (char)(hexValue -10 + 'A');
			hex = hexDigit + hex;
			dec = dec / 16;
		}
		return hex;
	}

}
