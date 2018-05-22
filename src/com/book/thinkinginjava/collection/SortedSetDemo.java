package com.book.thinkinginjava.collection;

import java.util.*;

/**
 * @comments: SortedSet
 * @author: binvy
 * @Date: 2018/4/20
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet,
            "one tow three four five six seven eight nine ten"
                .split(" "));
        System.out.println(sortedSet);
        String first = sortedSet.first();
        String last = sortedSet.last();
        System.out.println(first);
        System.out.println(last);
        Iterator<String> iterator = sortedSet.iterator();
        for ( int i = 0; i < 6; i++ ) {
            if (i == 3) {
                last = iterator.next();
            }
            if (i == 6) {
                first = iterator.next();
            } else {
                iterator.next();
            }
        }
        System.out.println(first);
        System.out.println(last);
        Comparator<? super String> comparator = sortedSet.comparator();
        System.out.println(comparator);
        SortedSet<String> subSet = sortedSet.subSet(first, last);
        System.out.println(subSet);
        SortedSet<String> headSet = sortedSet.headSet(first);
        System.out.println(headSet);
        SortedSet<String> tailSet = sortedSet.tailSet(last);
        System.out.println(tailSet);
    }
}
