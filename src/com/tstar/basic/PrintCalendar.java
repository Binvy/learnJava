package com.tstar.basic;

import java.util.Scanner;

public class PrintCalendar {

	/**
	 * @Date: 2018-1-26 0:46:04
	 * @author Binvy
	 */
	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		// Prompt user enter a number of year(e.g.,2012)
		System.out.print("Enter a full year (e.g., 2012) : ");
		int year = input.nextInt();
		// Prompt user enter a number of month(1 - 12)
		System.out.print("Enter month as number between 1 and 12: ");
		int month = input.nextInt();
		
		// Display the result
		printCalendar(year, month);
	}

	/** Print the calendar for a month in a year  */
	private static void printCalendar(int year, int month) {
		// Print calendar header
		printCalendarHeader(year, month);
		
		// Print calendar body
		printCalendarBody(year, month);
	}

	/** Print the month title, e.g., March 2012 */
	private static void printCalendarHeader(int year, int month) {
		String monthName = "";
		switch (month) {
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "Match"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December"; break; 
			default:
		}
		System.out.println("       " + monthName + "  " + year);
		System.out.println("-----------------------------");
		System.out.println("  Sun Mon Tue Web Thu Fri Sat");
	}

	/** Print the month body */
	private static void printCalendarBody(int year, int month) {
		int startDay = getStartDay(year, month);
		
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
		
		int i = 0;
		for (i = 0; i < startDay; i++) {
			System.out.print("    ");
		}
		
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			
			if ((i + startDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	/** Get the start day of month/1/year */
	private static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);
		
		// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	/** Get the total number of days since January 1, 1800 */
	private static int getTotalNumberOfDays(int year, int month) {
		int total = 0;
		
		// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(year)) {
				total += 366;
			} else {
				total += 365;
			}
		}
		
		// Add days from Jan to the month prior to the calendar month
		for (int i = 0; i < month; i++) {
			total += getNumberOfDaysInMonth(year, i);
		}
		
		return total;
	}

	/** Determine if it is a leap year */
	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	/** Get the number of days in a month */
	private static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} 
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		if (month == 2) {
			return isLeapYear(year) ? 29 : 28;
		}
		return 0;
	}
}
