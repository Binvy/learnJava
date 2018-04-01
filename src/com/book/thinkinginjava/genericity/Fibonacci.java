package com.book.thinkinginjava.genericity;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/1
 */
public class Fibonacci implements Generator<Integer> {
    private int count = 0;
    @Override
    public Integer next() {
        return fab(count++);
    }
    private int fab(int n) {
        if(n < 2) {
            return 1;
        }
        return fab(n - 2) + fab(n - 1);
    }
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for ( int i = 0; i < 20; i++ ) {
            System.out.print(fibonacci.next() + " ");
        }
    }
}
