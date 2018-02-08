package com.tstar.thread;

/**
 * @comments: thread
 * @author: binvy
 * @Date: 2018/2/8 0008
 */
public class RunnableDemo implements Runnable{
    private Thread thread;
    private String threadName;

    RunnableDemo (String name) {
        threadName = name;
        System.out.println("Creating " + threadName );
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for ( int i = 5; i > 0; i-- ) {
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}

class TestRunnableDemo {
    public static void main(String[]args){
        RunnableDemo thread1 = new RunnableDemo("Thread-1");
        thread1.start();

        RunnableDemo thread2 = new RunnableDemo("Thread-2");
        thread2.start();

    }
}
