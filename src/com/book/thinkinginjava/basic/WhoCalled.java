package com.book.thinkinginjava.basic;

/**
 * @comments: 栈轨迹
 * @author: binvy
 * @Date: 2018/3/6
 */
public class WhoCalled {
    public static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement element: e.getStackTrace()) {
                System.out.println(element.getMethodName());
            }
        }
    }
    public static void g() { f(); }
    public static void h() { g(); }

    public static void main(String[] args) {
        f();
        System.out.println("----------------------");
        g();
        System.out.println("----------------------");
        h();
        System.out.println("----------------------");
    }
}
