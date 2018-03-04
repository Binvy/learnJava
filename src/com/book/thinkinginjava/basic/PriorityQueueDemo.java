package com.book.thinkinginjava.basic;
import java.util.*;
/**
 * @comments: PriorityQueue
 * @author: binvy
 * @Date: 2018/3/4
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Random random = new Random(47);
        for ( int i = 0; i < 10; i++ ) {
            priorityQueue.offer(random.nextInt( i + 10));
        }
        QueueDemo.printQueue(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 12, 11, 9 , 8, 7, 6, 3, 23, 24, 25, 2, 1);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQueue(priorityQueue);

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.<Integer>reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQueue(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>(strings);
        QueueDemo.printQueue(stringPriorityQueue);

        stringPriorityQueue = new PriorityQueue<>(strings.size(), Collections.<String>reverseOrder());
        stringPriorityQueue.addAll(strings);
        QueueDemo.printQueue(stringPriorityQueue);

        Set<Character> charSet = new HashSet<>();
        for ( char c: fact.toCharArray() ) {
            charSet.add(c);
        }
        PriorityQueue<Character> characterPriorityQueue = new PriorityQueue<>(charSet);
        QueueDemo.printQueue(characterPriorityQueue);
    }
}
