package com.book.thinkinginjava.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @comments: 无意识的递归
 * @author: binvy
 * @Date: 2018/3/7
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        //return "InfiniteRecursion address" + this + "\n";
        return "InfiniteRecursion address" + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for ( int i = 0; i < 10; i++ ) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
