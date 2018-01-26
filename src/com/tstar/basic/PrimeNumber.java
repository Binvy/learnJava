package com.tstar.basic;

public class PrimeNumber {

	/**
	 * 素数
	 */
	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are \n");
		printPremeNumbers(50);
	}
	
	/* Repeatedly find prime numbers  */
	public static void printPremeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIME_PER_LINE = 10; // Display 10 prime number per line
		int count = 0; // Count the number of prime number
		int number = 2; // A number to be tested for primeness
		
		while (count < numberOfPrimes) {
			if (isPrime(number)) {
				count++;
				if (count % NUMBER_OF_PRIME_PER_LINE == 0) {
					System.out.printf("%-5s\n", number);
				}
				else {
					System.out.printf("%-5s", number);
				}
				// Check whether the next number is prime
			}
			number++;
		}
	}
	
	
	/* Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) { // If true, number is not prime
				return false;	
			}
		}
		return true; // Number is prime
	}
}
