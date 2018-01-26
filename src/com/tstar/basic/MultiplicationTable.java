package com.tstar.basic;

public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("***********Multiplication Table*************");
		System.out.println("");
		System.out.print("    ");
		for(int i = 1; i <=9; i++) {
			System.out.print("   " + i);
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
		
	}

}
