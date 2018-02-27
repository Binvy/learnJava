package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/23
 */
public class TestOrderInInitialization {
    public static void main(String[] args) {
        House house = new House();
        house.f(); // Show that constructor is done
    }
}

class Window{
    Window(int marker) {
        System.out.println("Window-" + marker);
    }
}

class House{
    Window w1 = new Window(1); // Before constructor
    House() {
        // Show that we're in the constructor
        System.out.println("House()");
        w3 = new Window(33); // Reninitialize w3
    }
    Window w2 = new Window(2); // After constructor
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3); // At end
}
