package com.book.thinkinginjava.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @comments: 双向列队Deque
 * @author: binvy
 * @Date: 2018/4/20
 */
public class DequeTest {
    static void fillTest(Deque<Integer> deque) {
        for ( int i = 20; i < 27; i++ ) {
            deque.addFirst(i);
        }
        for ( int i = 50; i < 55; i++ ) {
            deque.addLast(i);
        }
    }

    static void printDeque(Deque<Integer> deque) {
        System.out.println("----" + deque.getClass().getName() + "----");
        fillTest(deque);
        System.out.println(deque);
        while (deque.size() != 0) {
            System.out.print(deque.removeFirst() + " ");
        }
        System.out.println();
        fillTest(deque);
        while (deque.size() != 0) {
            System.out.print(deque.removeLast() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        printDeque(deque);
        ConcurrentLinkedDeque<Integer> integerDeque = new ConcurrentLinkedDeque<>();
        printDeque(integerDeque);
        LinkedBlockingDeque<Integer> linkedBlockingDeque = new LinkedBlockingDeque<>();
        printDeque(linkedBlockingDeque);
        LinkedList<Integer> linkedList = new LinkedList<>();
        printDeque(linkedList);
    }
}
