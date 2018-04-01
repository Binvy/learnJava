package com.book.thinkinginjava.genericity;

/**
 * @comments: 简单的持有对象
 * @author: binvy
 * @Date: 2018/3/31
 */

/**
 * 普通自动手机类
 */
class AutoMobile{ }

/**
 * 持有对象1
 */
class Holder1 {
    private AutoMobile a;
    public Holder1(AutoMobile a) {
        this.a = a;
    }
    public AutoMobile get(){
        return a;
    }
}

/**
 * 持有对象2
 */
class  Holder2 {
    private Object o;
    public Holder2(Object o) {
        this.o = o;
    }
    public void set(Object o) {
        this.o = o;
    }
    public Object get() {
        return o;
    }
}
public class TestSimpleHolder {
    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new AutoMobile());
        AutoMobile o1 = (AutoMobile) holder2.get();
        holder2.set("Hello World");
        String o2 = (String) holder2.get();
        holder2.set(1);
        Integer o3 = (Integer) holder2.get();
    }
}
