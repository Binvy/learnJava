package com.book.thinkinginjava.basic;

import java.util.*;

/**
 * @comments: 容器的打印
 * @author: binvy
 * @Date: 2018/3/4
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("cat");
        collection.add("dog");
        collection.add("sheep");
        collection.add("lion");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
    }
}
