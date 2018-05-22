package com.book.thinkinginjava.collection;

import com.book.thinkinginjava.array.RandomGenerator;

import java.util.*;

/**
 * @comments: Collection的功能方法。
 * @author: binvy
 * @Date: 2018/4/20
 */
public class CollectionMethod {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.addAll(new ArrayList<>(Arrays.asList("hello", "world")));
        c.add("biu");
        c.add("biu");
        System.out.println(c);
        Object[] array = c.toArray();
        String[] str = c.toArray(new String[0]);
        System.out.println(Collections.max(c));
        System.out.println(Collections.min(c));
        Collection<String> c2 = new ArrayList<>();
        c2.addAll(new ArrayList<>(Arrays.asList("hello")));
        c.addAll(c2);
        System.out.println(c);
        c.remove(Countries.DATA[0][0]);
        System.out.println(c);
        c.remove(Countries.DATA[1][1]);
        System.out.println(c);
        c.removeAll(c2);
        System.out.println(c);
        c.addAll(c2);
        System.out.println(c);
        String val = Countries.DATA[2][0];
        System.out.println(c.contains(val));
        System.out.println(c.containsAll(c2));
        Collection<String> c3 = ((List<String>) c).subList(1, 2);
        c2.retainAll(c3);
        System.out.println(c2);
        c2.removeAll(c3);
        System.out.println("c2.isEmpty():" + c2.isEmpty());
        c = new ArrayList<>();
        int size = 10;
        String[] strings = new String[size];
        RandomGenerator.String random = new RandomGenerator.String();
        for ( int i = 0; i < size; i++ ) {
            strings[i] = random.next();
        }
        c.addAll(new ArrayList<>(Arrays.asList(strings)));
        System.out.println(c);
        c.clear();
        System.out.println("after c.clear()" + c);
    }
}
