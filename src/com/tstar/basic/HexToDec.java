package com.tstar.basic;

import java.util.Scanner;

public class HexToDec {

	/**
	 * Swap Hex to Decimal
	 */
	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		// Prompt user enter the hex String
		System.out.println("Enter a hex String: ");
		String hex = input.nextLine();
		
		// Display the decimal result
		System.out.println("The decimal value for the hex " + hex + " is " + hexToDecimal(hex));
	}
	
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else
			return ch - '0';
	}

}
