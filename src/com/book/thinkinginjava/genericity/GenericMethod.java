package com.book.thinkinginjava.genericity;

/**
 * @comments: 泛型方法
 * @author: binvy
 * @Date: 2018/4/2
 */
public class GenericMethod {
    public <T> void f(T t) {
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod instance = new GenericMethod();
        instance.f("");
        instance.f(1);
        instance.f(1.1f);
        instance.f(1.1);
        instance.f(1L);
        instance.f('c');
        instance.f(instance);
    }
}
