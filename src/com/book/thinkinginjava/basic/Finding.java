package com.book.thinkinginjava.basic;

import java.util.regex.Matcher;

import static java.util.regex.Pattern.*;

/**
 * @comments: Pattern and Matcher
 * @author: binvy
 * @Date: 2018/3/7
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = compile("\\w+").matcher("Evening is full of linnet's wings");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
        int i = 0;
        while (m.find(i)) {
            System.out.print(m.group() + " ");
            i++;
        }
    }
}
