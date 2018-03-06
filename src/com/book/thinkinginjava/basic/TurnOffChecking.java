package com.book.thinkinginjava.basic;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @comments: 异常的其他可选方式
 * @author: binvy
 * @Date: 2018/3/7
 */
class WrapCheckedException {
    void throwRunTimeException(int type) {
        try {
            switch (type) {
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException("Where am I?");
                default: return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
class SomeOtherException extends Exception {}
public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        // You can call throwRunTimeException() without a try block, and let RuntimeExceptions leave the method;
        wce.throwRunTimeException(3);
        // Or you can choose to catch exception;
        for ( int i = 0; i < 4; i++ ) {
            try {
                if (i < 3) {
                    wce.throwRunTimeException(i);
                } else {
                    throw new SomeOtherException();
                }
            } catch (SomeOtherException e) {
                System.out.println("SomeOtherException: " + e);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (FileNotFoundException e) {
                    System.out.println("FileNotFoundException: " + e);
                } catch (IOException e) {
                    System.out.println("IOException: " + e);
                } catch (Throwable e) {
                    System.out.println("Throwable: " + e);
                }
            }
        }
    }
}
