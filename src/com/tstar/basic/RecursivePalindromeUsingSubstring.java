package com.tstar.basic;

import java.util.Scanner;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/6 0006
 */
public class RecursivePalindromeUsingSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String string = input.nextLine();
        System.out.println("Is " + string + " a palindrome: " + isPalindrome(string));
    }

    private static boolean isPalindrome(String string) {
        int length = string.length();
        if (length <= 1) {
            return true;
        } else if (string.charAt(0) != string.charAt(length - 1)) {
            return false;
        } else {
            return isPalindrome(string.substring(1, length - 1));
        }
    }

    /** 递归辅助方法 (避免创建新字符串)*/
    public static boolean isPalindrome_suppport(String s) {
        return isPalindrome_suppport(s, 0, s.length() - 1);
    }

    private static boolean isPalindrome_suppport(String s, int low, int high) {
        if (high <= low) {
            return true;
        } else if (s.charAt(low) != s.charAt(high)) {
            return false;
        } else {
            return isPalindrome_suppport(s, low + 1, high - 1);
        }
    }
}
