package com.tstar.basic;

import java.util.Scanner;

public class SubtractionCaclLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final int NUMBER_OF_QUESTION = 5; // Number of questions
		int correctCount = 0; // Count the number of correct answers
		int count = 0; //Count the number of the questions
		long startTime = System.currentTimeMillis(); // start time
		String output = ""; // output string is initially empty
		Scanner input = new Scanner(System.in); // Create a scanner object
		
		while (count < NUMBER_OF_QUESTION) {
			// 1. Generate two random single-digit integers
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);
			
			// 2. Swap number1 with number2 when number1 < number2
			if (number1 < number2) {
				int temp = number2;
				number2 = number1;
				number1 = temp;
			}
			
			// 3. Prompt the student o answer "What is number1 - number2"
			System.out.print("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();
			
			// 4. Grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("You are current!");
				correctCount ++;
			}
			else {
				System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + 
						" should be " + (number1 - number2));
			}
			
			// Increase the question count
			count++;
			
			output += "\n" + number1 + " - " + number2 + " = " + answer + 
					((answer == number1 - number2) ? " correct" : "wrong");
		}
		
		long endTime = System.currentTimeMillis(); // end time
		long testTime = (endTime - startTime) / 1000; // Calculate the time
		
		System.out.println("Correct answer is " + correctCount 
				+ "\n" + "Test time is " + testTime + " seconds\n" + output);
		
	}

}
