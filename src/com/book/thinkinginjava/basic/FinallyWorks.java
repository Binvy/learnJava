package com.book.thinkinginjava.basic;

/**
 * @comments: 使用finally进行清理
 * @author: binvy
 * @Date: 2018/3/6
 */
public class FinallyWorks {
    static int count = 0;
    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0) {
                    throw new MyException3();
                }
                System.out.println("No exception");
            } catch (MyException3 myException3) {
                myException3.printStackTrace();
            } finally {
                System.out.println("In finally clause");
                if (count == 2) break;
            }
        }
    }
}
class MyException3 extends Exception { }
