package com.book.thinkinginjava.genericity;

import java.util.Iterator;
import java.util.Random;

/**
 * @comments: 泛型接口
 * @author: binvy
 * @Date: 2018/4/1
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Latte.class, Americano.class, Breve.class, Mocha.class, Cappuccino.class};
    private static Random random = new Random(47);
    public CoffeeGenerator() {}
    private int size = 0;
    public CoffeeGenerator(int size) {
        this.size = size;
    }
    @Override
    public Coffee next() {
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }
        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for ( int i = 0; i < 5; i++ ) {
            System.out.println(gen.next());
        }
        for ( Coffee c : new CoffeeGenerator(5)
               ) {
            System.out.println(c);
        }
    }
}
