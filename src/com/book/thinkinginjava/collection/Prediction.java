package com.book.thinkinginjava.collection;

import java.util.Random;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/4/23
 */
public class Prediction {
    private static Random random = new Random(47);
    private boolean shadow = random.nextDouble() > 0.5;
    @Override
    public String toString() {
        return shadow ? "Six more weeks of Winter" : "Early Spring";
    }
}

