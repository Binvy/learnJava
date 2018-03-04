package com.book.thinkinginjava.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @comments: Map
 * @author: binvy
 * @Date: 2018/3/4
 */
public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for ( int i = 0; i < 10000; i++ ) {
            int r = random.nextInt(30);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
        System.out.println("map中包含键1?" + map.containsKey(1));
        System.out.println("map中包含键59?" + map.containsKey(59));
        System.out.println("map中包含值333?" + map.containsValue(333));
        System.out.println("map中包含值444?" + map.containsValue(444));
    }
}
