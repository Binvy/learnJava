package com.book.thinkinginjava.basic;

/**
 * @comments: 接口的内部类。
 * @author: binvy
 * @Date: 2018/3/3
 */
public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("howdy!");
        }
        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
