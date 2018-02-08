package com.tstar.thread;

/**
 * @comments: 三线程打印ABC
 * @author: binvy
 * @Date: 2018/2/9 0009
 */
public class ThreeThreadPrinter implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    ThreeThreadPrinter (String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.println(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        ThreeThreadPrinter pa = new ThreeThreadPrinter("A", c, a);
        ThreeThreadPrinter pb = new ThreeThreadPrinter("B", a, b);
        ThreeThreadPrinter pc = new ThreeThreadPrinter("C", b, c);

        new Thread(pa).start();
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);

    }

}

