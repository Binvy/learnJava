package com.book.thinkinginjava.basic;

/**
 * @comments: finally清理
 * @author: binvy
 * @Date: 2018/3/6
 */
class Switcher {
    private boolean state = false;
    public boolean read() { return state; }
    public void on() {
        state = true;
        System.out.println(this);
    }
    public void off(){
        state = false;
        System.out.println(this);
    }
    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}
class OnOffException1 extends Exception { }
class OnOffException2 extends Exception { }
public class Switch {
    private static Switcher switcher = new Switcher();
    public static void f() throws OnOffException1, OnOffException2 { }
    public static void main(String[] args) {
        try {
            switcher.on();
            f();
        } catch (OnOffException2 onOffException2) {
            onOffException2.printStackTrace();
        } catch (OnOffException1 onOffException1) {
            onOffException1.printStackTrace();
        } finally {
            switcher.off();
        }
    }
}
