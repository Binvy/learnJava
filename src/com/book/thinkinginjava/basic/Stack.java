package com.book.thinkinginjava.basic;

import java.util.LinkedList;

/**
 * @comments: 栈
 * @author: binvy
 * @Date: 2018/3/4
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v) {
        storage.addFirst(v);
    }
    public T peek() {
        return storage.getFirst();
    }
    public T pop() {
        return storage.removeFirst();
    }
    public boolean isEmpty() {
        return storage.isEmpty();
    }
    @Override
    public String toString() {
        return storage.toString();
    }
}
