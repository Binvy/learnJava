package com.book.thinkinginjava.basic;

/**
 * @comments: 生成对外部类的引用
 * @author: binvy
 * @Date: 2018/3/3
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        DotThis.Inner dti = dotThis.inner();
        dti.outer().f();
    }
}
