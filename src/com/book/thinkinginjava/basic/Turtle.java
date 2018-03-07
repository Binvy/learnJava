package com.book.thinkinginjava.basic;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @comments: Formatter类
 * @author: binvy
 * @Date: 2018/3/7
 */
public class Turtle {
    private String name;
    private Formatter formatter;
    public Turtle(String name, Formatter formatter) {
        this.name = name;
        this.formatter = formatter;
    }
    public void move(int x, int y) {
        formatter.format("%s Turtle is at (%d, %d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream printWriter = System.out;
        Turtle tonny = new Turtle("tonny", new Formatter(System.out));
        Turtle jerry = new Turtle("jerry", new Formatter(printWriter));
        tonny.move(2, 3);
        jerry.move(3, 4);
    }
}
