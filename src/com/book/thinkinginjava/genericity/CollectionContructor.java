package com.book.thinkinginjava.genericity;

import java.util.*;

/**
 * @comments: 创建各种容器类
 * @author: binvy
 * @Date: 2018/4/2
 */
public class CollectionContructor {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }
    public static <T> List<T> list() {
        return new ArrayList<T>();
    }
    public static <T> LinkedList<T> linkedList() {
        return new LinkedList<T>();
    }
    public static <T> Set<T> set() {
        return new HashSet<T>();
    }
    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> sls = map();
        List<String> list = list();
        LinkedList<String> linkedList = linkedList();
        Set<String> set = set();
        Queue<String> queue = queue();
    }
}
