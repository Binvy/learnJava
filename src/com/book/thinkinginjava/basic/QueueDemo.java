package com.book.thinkinginjava.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @comments: Queue
 * @author: binvy
 * @Date: 2018/3/4
 */
public class QueueDemo {
    public static void printQueue(Queue queue) {
        while(queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random random = new Random(47);
        for ( int i = 0; i < 10; i++ ) {
            queue.offer(random.nextInt( i + 10));
        }
        printQueue(queue);
        Queue<Character> queueChar = new LinkedList<Character>();
        for ( Character c : "Brontosaurus".toCharArray() ) {
            queueChar.offer(c);
        }
        printQueue(queueChar);
    }
}
