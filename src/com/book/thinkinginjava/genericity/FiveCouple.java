package com.book.thinkinginjava.genericity;

/**
 * @comments: 通过继承扩展元祖类
 * @author: binvy
 * @Date: 2018/3/31
 */
public class FiveCouple<A, B, C, D, E> extends FourCouple {
    public final E e;
    public FiveCouple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.e = e;
    }
    @Override
    public String toString() {
        return "(" + a + "," + b + "," + c + "," + d + "," + e + ")";
    }
}
