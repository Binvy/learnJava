package com.tstar.thread;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/9 0009
 */
public class DisplayMessage implements Runnable {
    private String message;

    DisplayMessage (String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}
