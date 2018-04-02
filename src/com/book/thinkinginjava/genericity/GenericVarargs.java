package com.book.thinkinginjava.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @comments: 可变参数与泛型方法
 * @author: binvy
 * @Date: 2018/4/2
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T...args) {
        List<T> result = new ArrayList<>();
        for ( T t : args ) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(makeList("A"));
        System.out.println(makeList("A", "B", "C"));
        System.out.println(makeList(("ABCDEFGHIJKLMNOPQRSTUVWXYZ").split("")));
    }
}
