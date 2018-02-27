package com.book.thinkinginjava.basic;

/**
 * @comments: 方法调用中的别名问题
 * @author: binvy
 * @Date: 2018/2/21
 */
public class TestAliasName {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        System.out.println("1: letter.c = " + letter.c);

        f(letter);
        System.out.println("2: letter.c = " + letter.c);
    }
}
class Letter{
    char c;
}

