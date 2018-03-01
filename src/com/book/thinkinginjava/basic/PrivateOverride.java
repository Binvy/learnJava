package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/1
 */
public class PrivateOverride {
    private void f() {
        System.out.println("PrivateOverride private f()");
    }

    public static void main(String[] args) {
        PrivateOverride  privateOverride = new Derived();
        privateOverride.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("Derived public f()");
    }
}
