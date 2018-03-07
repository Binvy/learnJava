package com.book.thinkinginjava.basic;

import java.util.Arrays;

import static java.util.regex.Pattern.*;

/**
 * @comments: split()
 * @author: binvy
 * @Date: 2018/3/7
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(compile("!!").split(input)));
        // Only do the first three
        System.out.println(Arrays.toString(compile("!!").split(input, 3)));
    }
}
