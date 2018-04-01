package com.book.thinkinginjava.genericity;

/**
 * @comments: 简单的泛型类
 * @author: binvy
 * @Date: 2018/3/31
 */
public class SimpleGenericity<T> {
    private T t;
    public SimpleGenericity(T t) {
        this.t = t;
    }
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }

    public static void main(String[] args) {
        SimpleGenericity<AutoMobile> autoMobile = new SimpleGenericity<>(new AutoMobile());
        AutoMobile mobile = autoMobile.get();
        // autoMobile.set("Hello World");
        //  autoMobile.set(1);
    }
}
