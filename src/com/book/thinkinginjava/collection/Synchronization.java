package com.book.thinkinginjava.collection;

import java.util.*;

/**
 * @comments: Colletion同步
 * @author: binvy
 * @Date: 2018/4/24
 */
public class Synchronization {
    public static void synchronizedCollection() {
        Collection<String> collection = Collections.synchronizedCollection(new ArrayList<String>());
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        Set<String> set = Collections.synchronizedSet(new HashSet<String>());
        Set<String> sortedSet = Collections.synchronizedSortedSet(new TreeSet<String>());
        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
        Map<String, String> sortedMap = Collections.synchronizedSortedMap(new TreeMap<String, String>());
    }

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        Iterator<String> iterator = c.iterator();
        c.add("biu");
        try {
            String str = iterator.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
