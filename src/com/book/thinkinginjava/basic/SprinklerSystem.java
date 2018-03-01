package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/1
 */
public class SprinklerSystem {
    private String value1, value2, value3, value4;
    private int i;
    private float f;
    private WaterSource waterSource;
    @Override
    public String toString() {
        return "SprinkleSystem:" + " " +
                "value1:" + value1 + " " +
                "value2:" + value1 + " " +
                "value3:" + value1 + " " +
                "value4:" + value1 + " " +
                "i:" + i + " " +
                "f:" + f + " " +
                "WaterSource:" + waterSource;
    }

    public static void main(String[] args) {
        System.out.println(new SprinklerSystem());
    }
}

class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}
