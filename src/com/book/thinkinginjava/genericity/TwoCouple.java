package com.book.thinkinginjava.genericity;

/**
 * @comments: 元祖
 * @author: binvy
 * @Date: 2018/3/31
 */
public class TwoCouple<A, B> {
    public final A a;
    public final B b;
    public TwoCouple(A a, B b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString() {
        return  "(" + a + "," +  b + ")";
    }
}
