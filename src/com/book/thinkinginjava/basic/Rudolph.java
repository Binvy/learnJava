package com.book.thinkinginjava.basic;

/**
 * @comments: 创建正则表达式
 * @author: binvy
 * @Date: 2018/3/7
 */
public class Rudolph {
    public static void main(String[] args) {
        for (String partten : new String[]{"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"} ) {
            System.out.println("Rudolph".matches(partten));
        }
    }
}
