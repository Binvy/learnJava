package com.book.thinkinginjava.basic;

/**
 * @comments: 异常的方法
 * @author: binvy
 * @Date: 2018/3/6
 */
public class ExceptionMethod {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getMessage() " + e.getMessage());
            System.out.println("getLocalizedMessage() " + e.getLocalizedMessage());
            System.out.println("getCause() " + e.getCause());
            System.out.println("getStackTrace() " + e.getStackTrace());
            System.out.println("getSuppressed() " + e.getSuppressed());
            System.out.println("getClass() " + e.getClass());
            System.out.println("toString() " + e);
            System.out.println("printStackTrace() ");
            e.printStackTrace(System.out);
        }
    }
}
