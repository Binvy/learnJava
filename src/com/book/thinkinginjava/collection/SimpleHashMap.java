package com.book.thinkinginjava.collection;

import java.util.*;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/23
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    static final int SIZE = 997;
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
    @Override
    public V put(K key, V value) {
        V oleValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        MapEntry<K, V> pair = new MapEntry<>(key, value);
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oleValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }
        if (!found) {
            buckets[index].add(pair);
        }
        return oleValue;
    }
    @Override
    public V get(Object o) {
        int index = Math.abs(o.hashCode()) % SIZE;
        if (buckets[index] == null) {
            return null;
        }
        for (MapEntry<K, V> iPair : buckets[index]) {
            if (iPair.getKey().equals(o)) {
                return iPair.getValue();
            }
        }
        return null;
    }
        @Override
    public Set<Map.Entry<K, V>> entrySet() {
            HashSet<Entry<K, V>> set = new HashSet<>();
            for (LinkedList<MapEntry<K, V>> bucket : buckets) {
                if(bucket == null) {
                    continue;
                }
                for (MapEntry<K, V> mpair : bucket) {
                    set.add(mpair);
                }
            }
            return set;
    }

    public static void main(String[] args) {
        SimpleHashMap<String, String> simpleHashMap = new SimpleHashMap<>();
        simpleHashMap.putAll(Countries.capitals(15));
        System.out.println(simpleHashMap);
        System.out.println(simpleHashMap.get("CHINA"));
        System.out.println(simpleHashMap.entrySet());
    }
}
