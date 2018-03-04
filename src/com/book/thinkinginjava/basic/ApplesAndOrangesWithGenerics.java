package com.book.thinkinginjava.basic;

import java.util.ArrayList;

/**
 * @comments: 泛型
 * @author: binvy
 * @Date: 2018/3/4
 */
class GrannySimit extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for ( int i = 0; i < 4; i++ ) {
            apples.add(new Apple());
        }
        apples.add(new GrannySimit());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        // Compile-time error;
        // apples.add(new Orange);
        for ( int i = 0; i < apples.size(); i++ ) {
            System.out.println(apples.get(i).id());
        }
        // Using foreach
        for ( Apple apple : apples ) {
            System.out.println(apple);
        }
    }
}
