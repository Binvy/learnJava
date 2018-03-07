package com.book.thinkinginjava.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @comments: Pattern and Matcher
 * @author: binvy
 * @Date: 2018/3/7
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            System.out.println("Regular expression:\"" + arg + "\"");
            Pattern pattern = Pattern.compile(arg);
            Matcher matcher = pattern.matcher(args[0]);
            while (matcher.find()) {
                System.out.println("Match \"" + matcher.group() + "\" at positions " +
                        matcher.start() + "-" + (matcher.end() - 1));
            }

        }
    }
}
