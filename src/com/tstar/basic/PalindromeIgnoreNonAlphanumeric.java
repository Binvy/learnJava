package com.tstar.basic;

import java.util.Scanner;

/**
 * @comments: check a string is a palindrome ignore non alphanumeric
 * @author: binvy
 * @Date: 2018/1/30 0030
 */
public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);
        // prompt user enter a string to check
        System.out.println("Enter a string: ");
        // get the input string
        String str = input.nextLine();
        // display the result
        System.out.println("Is " + str + " a palindrome string?" + "\n" + isPalindrome(str));
    }

    /** check the string is a palindrome string or not */
    private static boolean isPalindrome(String str) {
        // format the string with rules
        String str1 = format(str);
        // reverse the string
        String str2 = reverse(str1);
        // return isPalindrome
        return str1.equals(str2);
    }

    /** format the string, clear the nonalphanumeric char in the string */
    private static String format(String str) {
        // create a stringbuilder object
        StringBuilder stringBuilder = new StringBuilder();
        // swap the string to a char array
        char[] charArray = str.toCharArray();
        // upset the char array and clear the nonalphanumeric char
        for ( int i = 0; i < charArray.length; i++ ) {
            if (Character.isLetterOrDigit(charArray[i])) {
                stringBuilder.append(charArray[i]);
            }
        }
        // return the format string
        return stringBuilder.toString();
    }

    /** reserve the string and return it */
    private static String reverse(String str) {
        // create a stringbuilder object
        StringBuilder stringBuilder = new StringBuilder(str);
        // reverse the object
        stringBuilder.reverse();
        // return the object's string value after reverse
        return stringBuilder.toString();
    }
}
