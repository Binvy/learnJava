package com.book.thinkinginjava.collection;

import java.util.*;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/23
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys =  new ArrayList<>();
    private List<V> values =  new ArrayList<>();
    @Override
    public V put(K key, V value) {
        V oldValue = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
    }
    public V get(Object key) {
        if (!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }
    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext()) {
            set.add(new MapEntry<K, V>(ki.next(), vi.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String, String> map = new SlowMap<>();
        map.putAll(Countries.capitals(15));
        System.out.println(map);
        System.out.println(map.get("China"));
        System.out.println(map.entrySet());
    }
}
