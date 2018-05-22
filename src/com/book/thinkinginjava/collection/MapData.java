package com.book.thinkinginjava.collection;

import com.book.thinkinginjava.genericity.Generator;

import java.util.LinkedHashMap;

/**
 * @comments: Map生成Generator
 * @author: binvy
 * @Date: 2018/4/19
 */
public class MapData<K, V> extends LinkedHashMap<K, V> {
    public MapData(Generator<Pair<K, V>> generator, int quantity) {
        for ( int i = 0; i < quantity; i++ ) {
            Pair<K, V> pair = generator.next();
            put(pair.key, pair.value);
        }
    }
    public MapData(Generator<K> k, Generator<V> v, int quantity) {
        for ( int i = 0; i < quantity; i++ ) {
            put(k.next(), v.next());
        }
    }
    public MapData(Generator<K> k, V v, int quantity) {
        for ( int i = 0; i < quantity; i++ ) {
            put(k.next(), v);
        }
    }
    public MapData(Iterable<K> iterable, Generator<V> v) {
        for (K k : iterable) {
            put(k , v.next());
        }
    }
    public MapData(Iterable<K> iterable, V v) {
        for (K k : iterable) {
            put(k, v);
        }
    }
    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> generator, int quantity) {
        return new MapData<>(generator, quantity);
    }
    public static <K, V> MapData<K, V> map(Generator<K> k, Generator<V> v, int quantity) {
        return new MapData(k, v, quantity);
    }
    public static <K, V> MapData<K, V> map(Generator<K> k, V v, int quantity) {
        return new MapData(k, v, quantity);
    }
    public static <K, V> MapData<K, V> map(Iterable<K> iterable, Generator<V> v) {
        return new MapData<>(iterable, v);
    }
    public static <K, V> MapData<K, V> map(Iterable<K> iterable, V v) {
        return new MapData<>(iterable, v);
    }

}
