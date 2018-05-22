package com.book.thinkinginjava.collection;

/**
 * @comments: Map型类
 * @author: binvy
 * @Date: 2018/4/19
 */
public class Pair<K, V> {
    public final K key;
    public final V value;
    public Pair(K key, V value){
        this.key = key ;
        this.value = value;
    }
}
