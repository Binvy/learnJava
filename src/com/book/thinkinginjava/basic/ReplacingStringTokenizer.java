package com.book.thinkinginjava.basic;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @comments: StringTokenizer
 * @author: binvy
 * @Date: 2018/3/7
 */
public class ReplacingStringTokenizer {
    public static void main(String[] args) {
        String input = "But I'm not dead yet! I feel happy!";
        StringTokenizer stoken = new StringTokenizer(input);
        while (stoken.hasMoreElements()) {
            System.out.print(stoken.nextToken() + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(input.split(" ")));
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            System.out.print(scanner.next() + " ");
        }
    }
}
