package com.book.thinkinginjava.collection;

/**
 * @comments: 简单的Map实现
 * @author: binvy
 * @Date: 2018/4/20
 */
public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;
    public AssociativeArray(int length) {
        pairs = new Object[length][2];
    }
    public void put(K k, V v) {
        if (index >= pairs.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index++] = new Object[]{k, v};
    }
    public V get(K key) {
        for ( int i = 0; i < index; i++ ) {
            if (key == pairs[i][0]) {
                return (V)pairs[i][1];
            }
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for ( int i = 0; i < index; i++ ) {
            result.append(pairs[i][0].toString());
            result.append(" : ");
            result.append(pairs[i][1].toString());
            if (i < index - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        AssociativeArray<String, String> map = new AssociativeArray<String, String>(6);
        map.put("sky", "blue");
        map.put("sea", "water");
        map.put("bird", "fly");
        map.put("dog", "tidy");
        map.put("sheep", "mei");
        map.put("me","man");
        try{
          map.put("game", "lol");
        } catch (Exception e) {
            System.out.println("too many objects");
        }
        System.out.println(map);
        System.out.println(map.get("me"));
    }
}
