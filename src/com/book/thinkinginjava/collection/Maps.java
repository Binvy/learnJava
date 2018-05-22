package com.book.thinkinginjava.collection;

import com.sun.javafx.WeakReferenceMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/23
 */
public class Maps {
    public static void printMap(Map<Integer, String> map) {
        System.out.println("Size = " + map.size());
        System.out.println("Keys: ");
        System.out.println(map.keySet());
    }
    public static void test(Map<Integer, String> map) {
        System.out.println(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
        // Map has 'Set' behavior for keys
        map.putAll(new CountingMapData(25));
        printMap(map);
        // Producing a collection of the values
        System.out.println("Values: ");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11): " + map.containsKey(11));
        System.out.println("map.get(11):" + map.get(11));
        System.out.println("map.containsValue(\"F0\"): " + map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        System.out.println("First key in map: " + key);
        map.remove(key);
        printMap(map);
        map.clear();
        System.out.println("map.isEmpty(): " + map.isEmpty());
        map.putAll(new CountingMapData(25));
        // Operations on the set change the map
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }
    public static void main(String[] args) {
        test(new HashMap<Integer, String>());
        test(new TreeMap<Integer, String>());
        test(new LinkedHashMap<Integer, String>());
        test(new IdentityHashMap<Integer, String>());
        test(new ConcurrentHashMap<Integer, String>());
        test(new ConcurrentSkipListMap<Integer, String>());
        test(new WeakHashMap<Integer, String>());
    }
}
