package com.book.thinkinginjava.genericity;

/**
 * @comments: 元祖类通过继承进行扩展
 * @author: binvy
 * @Date: 2018/3/31
 */
public class FourCouple<A, B, C, D> extends ThreeCouple {
    public final D d;
    public FourCouple(A a, B b, C c, D d) {
        super(a, b, c);
        this.d = d;
    }
    @Override
    public String toString() {
        return "(" + a + "," + b + "," + c + "," + d + ")";
    }
}
