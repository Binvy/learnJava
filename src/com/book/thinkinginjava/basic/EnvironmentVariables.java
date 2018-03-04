package com.book.thinkinginjava.basic;

import java.util.Map;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/4
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for ( Map.Entry entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
