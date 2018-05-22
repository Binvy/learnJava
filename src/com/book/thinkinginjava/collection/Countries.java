package com.book.thinkinginjava.collection;

import java.util.*;

/**
 * @comments: 享元模式
 * @author: binvy
 * @Date: 2018/4/19
 */
public class Countries {
    public static final String[][] DATA = {
            {"ALGERIA", "Algerias"},
            {"CHINA", "Beijing"},
            {"JAPAN", "Tokyo"},
            {"BEIJING", "BEIJING"},
            {"TIANJIN", "TIANJIN"},
            {"CHONGQING", "CHONGQING"},
            {"SHANGHAI", "SHANGHAI"},
            {"HEBEI", "SHIJIAZHUANG"},
            {"HEILONGJIANG", "HAERBIN"},
            {"JILIN", "CHANGCHUN"},
            {"LIAONING", "SHENYANG"},
            {"NEIMENGGU", "HUHEHAOTE"},
            {"SHANXI", "TAIYUAN"},
            {"HENAN", "ZHENZHOU"}
    };
    private static class FlyWeightMap extends AbstractMap<String, String> {
        private static class Entry implements Map.Entry<String, String> {
            int index;
            Entry(int index) { this.index = index; }
            @Override
            public boolean equals(Object o) { return DATA[index][0].equals(o); }
            @Override
            public String getKey() { return DATA[index][0]; }
            @Override
            public String getValue() { return DATA[index][1]; }
            @Override
            public String setValue(String value) { return null; }
            public int HashCode() { return DATA[index][0].hashCode(); }
        }
        static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            private int size;
            EntrySet(int size) { this.size = size < 0 ? 0 : (size > DATA.length ? DATA.length : size); }
            @Override
            public Iterator<Map.Entry<String, String>> iterator() { return new Iter(); }
            @Override
            public int size() { return size; }
            private class Iter implements Iterator<Map.Entry<String, String>> {
                private Entry entry = new Entry(-1);
                @Override
                public boolean hasNext() { return entry.index < size - 1; }
                @Override
                public Map.Entry<String, String> next() {
                    entry.index++;
                    return entry;
                }
                @Override
                public void remove() { System.out.println("No Such Method"); }
            }
        }
        private static Set<Map.Entry<String, String>> entries = new EntrySet(DATA.length);
        @Override
        public Set<Map.Entry<String, String>> entrySet() { return entries; }
    }
    static Map<String, String> select(final int size) {
        return new FlyWeightMap() {
            @Override
            public Set<Map.Entry<String, String>> entrySet() {
                return new EntrySet(size);
            }
        };
    }
    static Map<String, String> map = new FlyWeightMap();
    public static Map<String, String> capitals() {
        return map;
    }
    public static Map<String, String> capitals(int size) {
        return select(size);
    }
    static List<String> names = new ArrayList<>(map.keySet());
    public static List<String> names() { return names; }
    public static List<String> names(int size) {
        return new ArrayList<>(select(size).keySet());
    }
    public static void main(String[] args) {
        System.out.println(capitals(10));
        System.out.println(names(9));
        System.out.println(new HashMap<>(capitals(10)));
        System.out.println(new LinkedHashMap<>(capitals(3)));
        System.out.println(new TreeMap<>(capitals(3)));
        System.out.println(new Hashtable<>(capitals(3)));
        System.out.println(new LinkedHashSet<>(names(3)));
        System.out.println(new TreeSet<>(names(6)));
        System.out.println(new ArrayList<>(names(6)));
        System.out.println(new LinkedList<>(names(6)));
        System.out.println(capitals().get("CHINA"));
    }
}
