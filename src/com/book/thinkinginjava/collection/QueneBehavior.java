package com.book.thinkinginjava.collection;

import com.book.thinkinginjava.genericity.Generator;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * @comments: 列队
 * @author: binvy
 * @Date: 2018/4/20
 */
public class QueneBehavior {
    private static int count = 10;
    static <T> void test(Queue<T> queue, Generator<T> gen) {
        for ( int i = 0; i < count; i++ ) {
            queue.offer(gen.next());
        }
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    static class Gen implements Generator<String> {
        String[] s = "one two three four five six seven eight nine ten".split(" ");
        int i;
        @Override
        public String next() { return s[i++]; }
    }
    public static void main(String[] args) {
        test(new LinkedList<String>(), new Gen());
        test(new PriorityQueue<String>(), new Gen());
        test(new ArrayDeque<String>(), new Gen());
        test(new ArrayBlockingQueue<String>(count), new Gen());
        test(new ConcurrentLinkedDeque<String>(), new Gen());
        test(new ConcurrentLinkedQueue<String>(), new Gen());
        test(new LinkedBlockingDeque<String>(), new Gen());
        test(new LinkedTransferQueue<String>(), new Gen());
        test(new PriorityBlockingQueue<String>(), new Gen());
        test(new SynchronousQueue<String>(), new Gen());
    }
}
