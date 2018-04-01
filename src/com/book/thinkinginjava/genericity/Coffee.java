package com.book.thinkinginjava.genericity;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/1
 */
public class Coffee {
    public static long counter = 0;
    public final long id = counter++;
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
