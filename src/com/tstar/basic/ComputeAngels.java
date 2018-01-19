package com.tstar.basic;

import java.util.Scanner;

public class ComputeAngels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a scanner obj
		Scanner input = new Scanner(System.in);
		// prompt user enter the coodinates of three points
		System.out.print("Enter the coodinates of three points separated");
		// get the coodinates 
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// calculate the length of three sides
		double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
		
		// calculate the angles
		double A = Math.acos((b * b + c * c - a * a) / (2 * b * c));
		double B = Math.acos((a * a + c * c - b * b) / (2 * a * c));
		double C = Math.acos((a * a + b * b - c * c) / (2 * a * b));
		
		double angelA = Math.round(Math.toDegrees(A) * 100 / 100.0);
		double angelB = Math.round(Math.toDegrees(B) * 100 / 100.0);
		double angelC = Math.round(Math.toDegrees(C) * 100 / 100.0);
		
		System.out.println("The three angles are: " + angelA + "\t" + angelB + "\t" + angelC);
		
	}

}
