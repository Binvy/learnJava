package com.book.thinkinginjava.basic;

import java.util.Arrays;

/**
 * @comments: 正则表达式之基础
 * @author: binvy
 * @Date: 2018/3/7
 */
public class TestRegMatch {
    private static String kninghts = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... with ... a herring!";
    public static void split (String regex) {
        System.out.println(Arrays.toString(kninghts.split(regex)));
    }

    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("1234".matches("-?\\d+"));
        System.out.println("+1234".matches("-?\\d+"));
        System.out.println("+1234".matches("(-|\\+)?\\d+"));

        split(" ");
        split("\\W+");
        split("n\\W+");

        System.out.println(kninghts.replaceFirst("f\\w+", "located"));
        System.out.println(kninghts.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
