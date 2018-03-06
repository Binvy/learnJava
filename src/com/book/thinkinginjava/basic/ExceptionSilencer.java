package com.book.thinkinginjava.basic;

/**
 * @comments: 异常丢失
 * @author: binvy
 * @Date: 2018/3/6
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the finally block will silence any throw exception
            return;
        }
    }
}
