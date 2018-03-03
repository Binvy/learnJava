package com.book.thinkinginjava.basic;

/**
 * @comments: 局部内部类
 * @author: binvy
 * @Date: 2018/3/4
 */
interface Counter {
    int next();
}
public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        // A local inner class
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }
            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        }
        return new LocalCounter();
    }
    // The same thing with an anonymous inner class;
    Counter getCounter2 (final String name) {
        return new Counter() {
            // Anonymous inner class cannot have a named constructor, only an instance initializer
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        };
    }
    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        Counter counter1 = localInnerClass.getCounter("local inner "),
                counter2 = localInnerClass.getCounter2("Anonymous inner ");
        for ( int i = 0; i < 5; i++ ) {
            System.out.println(counter1.next());
        }
        for ( int i = 0; i < 5; i++ ) {
            System.out.println(counter2.next());
        }
    }
}
