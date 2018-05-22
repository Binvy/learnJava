package com.book.thinkinginjava.collection;

/**
 * @comments: 性能测试框架
 * @author: binvy
 * @Date: 2018/4/23
 */
public abstract class Test<C> {
    String name;
    public Test(String name) {
        this.name = name;
    }
    abstract int test(C container, TestParam tp);
}
