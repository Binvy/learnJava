package com.book.thinkinginjava.genericity;

import java.util.Iterator;

/**
 * @comments: 适配器实现Iterable的Fibonacci生成器
 * @author: binvy
 * @Date: 2018/4/1
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
    private int n;
    public IterableFibonacci(int n){
        this.n = n;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for ( int i : new IterableFibonacci(20)
               ) {
            System.out.print(i + " ");
        }
    }
}
