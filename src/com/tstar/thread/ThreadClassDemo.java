package com.tstar.thread;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/9 0009
 */
public class ThreadClassDemo {
    public static void main(String[] args) {
        DisplayMessage hello = new DisplayMessage("Hello");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("hello");
        System.out.println("Starting hello thread...");
        thread1.start();

        DisplayMessage goodbye = new DisplayMessage("Goodbye");
        Thread thread2 = new Thread(goodbye);
        thread2.setDaemon(true);
        thread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Starting goodbye thread");
        thread2.start();

        System.out.println("Starting thread3");
        Thread thread3 = new GuessANumber(55);
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread interrupted");
        }

        System.out.println("Starting thread4");
        Thread thread4 = new GuessANumber(66);
        thread4.start();
        System.out.println("main() is ending....");
    }
}
