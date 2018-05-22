package com.book.thinkinginjava.collection;

import com.book.thinkinginjava.array.RandomGenerator;
import com.book.thinkinginjava.genericity.Generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/19
 */
class Government implements Generator<String> {
    String[] foundation = ("Strange ladies lying in ponds distributing " +
            "swords is no basis for a system of government!").split(" ");
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }
}
public class CollectionDataTest {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>(new CollectionData<String>(new Government(), 15));
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);

        System.out.println(new ArrayList<>(CollectionData.list(new RandomGenerator.String(), 10)));
        System.out.println(new ArrayList<>(CollectionData.list(new RandomGenerator.Integer(), 10)));
    }
}
