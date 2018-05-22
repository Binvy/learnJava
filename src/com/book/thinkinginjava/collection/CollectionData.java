package com.book.thinkinginjava.collection;

import com.book.thinkinginjava.genericity.Generator;

import java.util.ArrayList;

/**
 * @comments: 数组-填充-Generator:适配器模式
 * @author: binvy
 * @Date: 2018/4/19
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> generator, int quantity){
        for ( int i = 0; i < quantity; i++ ) {
            add(generator.next());
        }
    }
    public static <T> CollectionData<T> list(Generator<T> generator, int quantity){
        return new CollectionData<>(generator, quantity);
    }

}
