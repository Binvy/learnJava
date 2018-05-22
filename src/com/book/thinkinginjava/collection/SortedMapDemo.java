package com.book.thinkinginjava.collection;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/23
 */
public class SortedMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(new CountingMapData(10));
        System.out.println(treeMap);
        Integer low = treeMap.firstKey();
        Integer high = treeMap.lastKey();
        System.out.println("low: " + low);
        System.out.println("high: " + high);
        Iterator<Integer> iterator = treeMap.keySet().iterator();
        for ( int i = 0; i <= 6; i++ ) {
            if (i == 3) {
                low = iterator.next();
            }
            if (i == 6) {
                high = iterator.next();
            } else {
                iterator.next();
            }
        }
        System.out.println(low);
        System.out.println(high);
        System.out.println(treeMap.subMap(low, high));
        System.out.println(treeMap.headMap(high));
        System.out.println(treeMap.tailMap(low));
    }
}
