package com.book.thinkinginjava.basic;

import java.util.Random;

/**
 * @comments: 重载"+" 与 StringBuilder
 * @author: binvy
 * @Date: 2018/3/7
 */
public class WitherStringBuilder {
    public String implict(String[] fields) {
        String result = "";
        for ( int i = 0; i < fields.length; i++ ) {
            result += fields[i];
        }
        return result;
    }
    public String explict(String[] fields) {
        StringBuilder result = new StringBuilder();
        for ( int i = 0; i < fields.length; i++ ) {
            result.append(fields[i]);
        }
        return result.toString();
    }
    public static Random random = new Random(47);
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for ( int i = 0; i < 25; i++ ) {
            result.append(random.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new WitherStringBuilder());
    }
}
