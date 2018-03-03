package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/3
 */
public class DotNew {
    public class Inner {}

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner di = dotNew.new Inner();
    }
}
