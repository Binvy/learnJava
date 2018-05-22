package com.book.thinkinginjava.collection;

import java.util.LinkedHashMap;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/23
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> demo = new LinkedHashMap<>(new CountingMapData(25));
        System.out.println(demo);
        demo = new LinkedHashMap<>(16, 0.75f, true);
        demo.putAll(new CountingMapData(25));
        System.out.println(demo);
        for ( int i = 0; i < 6; i++ ) {
            demo.get(i);
        }
        System.out.println(demo);
        demo.get(0);
        System.out.println(demo);
    }
}
