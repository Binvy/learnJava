package com.book.thinkinginjava.collection;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/23
 */
public class Groundhog2 extends Groundhog {
    public Groundhog2(int number) {
        super(number);
    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Groundhog) && (((Groundhog) obj).number == number);
    }
}
