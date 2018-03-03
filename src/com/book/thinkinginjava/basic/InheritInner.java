package com.book.thinkinginjava.basic;

/**
 * @comments: 内部类继承
 * @author: binvy
 * @Date: 2018/3/4
 */
class WithInner {
    class Inner {};
}
public class InheritInner extends WithInner.Inner {
    // !InheritInner() {} Won't compile
    InheritInner(WithInner withInner) {
        withInner.super();
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
        InheritInner inheritInner = new InheritInner(withInner);
    }
}
