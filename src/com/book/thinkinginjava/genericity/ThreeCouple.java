package com.book.thinkinginjava.genericity;

/**
 * @comments: 元祖类通过继承进行扩展
 * @author: binvy
 * @Date: 2018/3/31
 */
public class ThreeCouple<A, B, C> extends TwoCouple {
    public final C c;
    public ThreeCouple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }
    @Override
    public String toString() {
        return "("+ a + "," + b + "," + c +")";
    }
}
