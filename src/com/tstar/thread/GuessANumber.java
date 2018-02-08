package com.tstar.thread;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/9 0009
 */
public class GuessANumber extends Thread {
    private int number;

    GuessANumber (int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int count = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guesses " + guess);
        } while (guess != number);
        System.out.println("** Correct!" + this.getName() + "in" + count + "guesses.**");
    }
}
