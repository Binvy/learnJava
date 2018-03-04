package com.book.thinkinginjava.basic;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @comments: Set
 * @author: binvy
 * @Date: 2018/3/4
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intHashSet = new HashSet<Integer>();
        Set<Integer> intTreeSet = new TreeSet<Integer>();
        Set<Integer> intLinkedHashSet = new LinkedHashSet<Integer>();
        Set<Integer> intCurrentSkipListSet = new ConcurrentSkipListSet<>();

        for ( int i = 0; i < 10000; i++ ) {
            intHashSet.add(random.nextInt(30));
            intTreeSet.add(random.nextInt(30));
            intLinkedHashSet.add(random.nextInt(30));
            intCurrentSkipListSet.add(random.nextInt(30));
        }
        System.out.println("HashSet:");
        for ( Integer i : intHashSet ) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("TreeSet:");
        for ( Integer i : intTreeSet ) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("LinkedHashSet:");
        for ( Integer i : intLinkedHashSet ) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("CurrentSkipListSet:");
        for ( Integer i : intCurrentSkipListSet ) {
            System.out.print(i + " ");
        }
    }
}
