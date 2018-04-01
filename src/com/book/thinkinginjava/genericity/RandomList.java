package com.book.thinkinginjava.genericity;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @comments: 任意类型的随机列表
 * @author: binvy
 * @Date: 2018/4/1
 */
public class RandomList<T> {
    private ArrayList<T>  storage = new ArrayList<>();
    public void add(T t) {
        storage.add(t);
    }
    ThreadLocalRandom random = ThreadLocalRandom.current();
    public T select() {
        return storage.get(random.nextInt(storage.size()));
    }
    public int length() {
        return storage.size();
    }
    public static void main(String[] args) {
        RandomList<String> list = new RandomList<>();
        String str = "hello world, how are you now? I'm coding!";
        for (String s: str.split(" ")) {
            list.add(s);
        }
        for ( int i = 0; i < list.length(); i++ ) {
            System.out.print(list.select() + " ");
        }
    }
}
