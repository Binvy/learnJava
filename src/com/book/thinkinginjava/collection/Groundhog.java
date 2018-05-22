package com.book.thinkinginjava.collection;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/23
 */
public class Groundhog {
    protected int number;
    public Groundhog(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Groundhog # " + number;
    }
}
