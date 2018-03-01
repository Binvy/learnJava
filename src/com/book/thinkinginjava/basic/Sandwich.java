package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/1
 */
public class Sandwich extends PortableLunch {
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();
    public Sandwich() {
        System.out.println("Sandwich()");
        super.eat();
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
    @Override
    public void eat() {
        System.out.println("PortableLunch eat()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
    @Override
    public void eat() {
        System.out.println("Lunch eat()");
    }
}

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
    public void eat() {
        System.out.println("Meal eat()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce");
    }
}

