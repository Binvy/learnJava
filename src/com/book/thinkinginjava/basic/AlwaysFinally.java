package com.book.thinkinginjava.basic;

/**
 * @comments: 嵌套finally
 * @author: binvy
 * @Date: 2018/3/6
 */
class FourException extends Exception {}
public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering first try block");
        try {
            System.out.println("Entering second try block");
            try {
                throw new FourException();
            } finally {
                System.out.println("finally in 2nd try block");
            }

        } catch (FourException e) {
            System.out.println("Caught FourException in 1st block");
        } finally {
            System.out.println("finally in 1st try block");
        }
    }
}
