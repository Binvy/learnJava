package com.book.thinkinginjava.collection;

import com.book.thinkinginjava.array.CountingGenerator;
import com.book.thinkinginjava.array.RandomGenerator;
import com.book.thinkinginjava.genericity.Generator;

import java.util.Iterator;

/**
 * @comments: 测试MapData
 * @author: binvy
 * @Date: 2018/4/19
 */
public class MapDataTest {
    public static void main(String[] args) {
        MapData<Integer, String> map = MapData.map(new Letters(), 10);
        System.out.println(map);
        System.out.println(MapData.map(new Letters(), "biu"));
        System.out.println(MapData.map(new Letters(), "biu", 10));
        System.out.println(MapData.map(new CountingGenerator.Integer(), new CountingGenerator.Character(), 26));
        System.out.println(MapData.map(new CountingGenerator.Integer(), new RandomGenerator.String(), 10));
        System.out.println(MapData.map(new CountingGenerator.Integer(), "biu", 10));
        System.out.println(MapData.map(new Letters(), new Letters()));
    }
}
class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 10;
    private int number = 1;
    private char letter = 'A';
    @Override
    public Pair<Integer, String> next() {
        return new Pair<>(number++, "" + letter++);
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }
            @Override
            public Integer next() {
                return number++;
            }
            @Override
            public void remove() {
                System.out.println("No Such Method!");
            }
        };
    }
}

