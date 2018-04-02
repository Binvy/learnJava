package com.book.thinkinginjava.genericity;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @comments: 用于Generator的泛型方法
 * @author: binvy
 * @Date: 2018/4/2
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n){
        for ( int i = 0; i < n; i++ ) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {
        Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 4 );
        for ( Coffee coffee : coffees
               ) {
            System.out.print(coffee + " ");
        }
        System.out.println();
        Collection<Integer> integers = fill(new ArrayList<Integer>(), new Fibonacci(), 20);
        for ( Integer integer : integers
               ) {
            System.out.print(integer + " ");
        }
    }
}
