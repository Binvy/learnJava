package com.book.thinkinginjava.basic;

/**
 * @comments: 创建自定义异常
 * @author: binvy
 * @Date: 2018/3/6
 */

class SimpleException extends Exception { }

public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions inheritingExceptions = new InheritingExceptions();
        try {
            inheritingExceptions.f();
        } catch (SimpleException e) {
            e.printStackTrace();
            System.out.println("Caught it!");
        }
    }
}
