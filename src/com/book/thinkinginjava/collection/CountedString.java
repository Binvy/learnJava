package com.book.thinkinginjava.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @comments: 散列码
 * @author: binvy
 * @Date: 2018/4/23
 */
public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;
    public CountedString(String str) {
        s =str;
        created.add(s);
        for ( String s2 : created) {
            if (s2.equals(s)) {
                id++;
            }
        }
    }
    @Override
    public String toString() {
        return "String:" + s + " id:" + id + " hashCode(): " + hashCode();
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }
    @Override
    public boolean equals(Object o) {
        return o instanceof CountedString
                && s.equals(((CountedString)o).s)
                && id == ((CountedString)o).id;
    }
    public static void main(String[] args) {
        HashMap<CountedString, Integer> map = new HashMap<>();
        CountedString[] array = new CountedString[5];
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = new CountedString("biu");
            map.put(array[i], i);
        }
        System.out.println(map);
        for (CountedString str : array) {
            System.out.print("Looking up " + str);
            System.out.print(map.get(str));
            System.out.println();
        }
    }
}
