package com.book.thinkinginjava.basic;

import java.util.Scanner;

/**
 * @comments: Scanner界定符
 * @author: binvy
 * @Date: 2018/3/7
 */
public class ScannerDlimiter {
    public static void main(String[] args) {
        Scanner input = new Scanner("12, 23, 23, 34, 45");
        input.useDelimiter("\\s*,\\s*");
        while (input.hasNextInt()) {
            System.out.println(input.nextInt());
        }
    }
}
