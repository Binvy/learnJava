package com.book.thinkinginjava.genericity;

/**
 * @comments: 泛型实现内部链式存储机制
 * @author: binvy
 * @Date: 2018/4/1
 */
public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;
        Node() {
            item = null;
            next = null;
        }
        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean end() {
            return item == null && next == null;
        }
    }
    private Node<T> top = new Node<>();
    public void push(T t) {
        top = new Node(t, top);
    }
    public T pop(){
        T result = top.item;
        if(!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        String str = "phasers on stun!";
        for (String s : str.split(" ")) {
            lss.push(s);
        }
        String s;
        while((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}
