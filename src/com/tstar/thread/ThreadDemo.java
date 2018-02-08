package com.tstar.thread;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/8 0008
 */
public class ThreadDemo extends Thread {
    private Thread thread;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for ( int i = 0; i < 5; i++ ) {
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Exiting " + threadName);
    }

    @Override
    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
