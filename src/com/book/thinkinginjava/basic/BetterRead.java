package com.book.thinkinginjava.basic;

import java.util.Scanner;

/**
 * @comments: Scanner
 * @author: binvy
 * @Date: 2018/3/7
 */
public class BetterRead {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(SimpleRead.input);
        System.out.println("What's your name?");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("How old are you? What's your favorite double?");
        int age = stdin.nextInt();
        Double favorite = stdin.nextDouble();
        System.out.println(age);
        System.out.println(favorite);
        System.out.format("Hi %s.\n", name);
        System.out.format("In 5 years you will be %d.\n", age + 5);
        System.out.format("My favorite double is %f." , favorite / 2 );
    }
}
