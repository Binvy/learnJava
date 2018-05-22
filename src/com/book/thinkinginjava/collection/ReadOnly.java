package com.book.thinkinginjava.collection;

import java.util.*;

/**
 * @comments: 容器只读
 * @author: binvy
 * @Date: 2018/4/24
 */
public class ReadOnly {
    static Collection<String> data = new ArrayList<>(Countries.names(6));
    public static void main(String[] args) {
        Collection<String> collection = Collections.unmodifiableCollection(new ArrayList<>(data));
        System.out.println(collection);
        // Can't change it
        collection.add("biu");

        List<String> list = Collections.unmodifiableList(new ArrayList<>(data));
        System.out.println(list);
        // Can't change it
        list.add("biu");

        Set<String> set = Collections.unmodifiableSet(new HashSet<>(data));
        System.out.println(set);
        // Can't change it
        set.add("biu");

        Set<String> treeSet = Collections.unmodifiableSortedSet(new TreeSet<>(data));
        System.out.println(treeSet);
        // Can't change it
        treeSet.add("biu");

        Map<String, String> map = Collections.unmodifiableMap(new HashMap<>(Countries.capitals(6)));
        System.out.println(map);
        // Can't change it
        map.put("key", "value");

        Map<String, String> treeMap = Collections.unmodifiableSortedMap(new TreeMap<>(Countries.capitals(6)));
        System.out.println(treeMap);
        // Can't change it
        treeMap.put("key", "value");
    }
}
