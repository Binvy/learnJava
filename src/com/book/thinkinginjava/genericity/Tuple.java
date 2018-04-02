package com.book.thinkinginjava.genericity;

/**
 * @comments: 简化元祖的使用
 * @author: binvy
 * @Date: 2018/4/2
 */
public class Tuple {
    public static <A, B> TwoCouple<A, B> tuple(A a, B b) {
        return new TwoCouple<>(a, b);
    }
    public static <A, B, C> ThreeCouple<A, B, C> tuple(A a, B b, C c) {
        return new ThreeCouple<>(a, b, c);
    }
}
