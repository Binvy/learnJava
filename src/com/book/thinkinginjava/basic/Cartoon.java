package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/1
 */
public class Cartoon extends Drawing{
    Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}