package com.book.thinkinginjava.basic;

import java.util.*;

/**
 * @comments: Collection容器与Collections工具类
 * @author: binvy
 * @Date: 2018/3/4
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>();
        for ( int i = 0; i < 10; i++ ) {
            collection.add(i);
        }
        for ( Integer i : collection ) {
            System.out.println(i + " ");
        }
        System.out.println("最小值: " + Collections.min(collection));
        System.out.println("最大值: " + Collections.max(collection));
    }
}
