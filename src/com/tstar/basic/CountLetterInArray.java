package com.tstar.basic;

/**
 * Created by binvy on 2018/1/27 0027
 */
public class CountLetterInArray {
    public static void main(String[] args) {
        // Create a array
        char[] chars = createArray();
        // Display the array
        System.out.println("The lower cases are: ");
        displayArray(chars);
        // Count the letter
        int[] counts = countLetters(chars);
        // Display the result
        System.out.println("The occurrences of each letter are: ");
        displayCount(counts);
    }

    /** Display the counts */
    private static void displayCount(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(counts[i] + " " + (char)('a' + i));
            } else {
                System.out.print(counts[i] + " " + (char)('a' + i) + "\t");
            }
        }        
    }

    /** Count the occurences of each letter */
    private static int[] countLetters(char[] chars) {
        // Declare an int array and create it
        int[] counts = new int[26];

        // Count the letters and assign them to the array
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        // Return the array
        return counts;
    }

    /** Display the array of characters */
    private static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    /** Create an arrray of characters  */
    private static char[] createArray() {
        // Declare an array of characters and create it
        char[] chars = new char[100];

        // Create lowercase letters randomly and assign them to the array
        for (int i = 0; i < chars.length; i++) {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        // Return the array
        return chars;
    }
}
