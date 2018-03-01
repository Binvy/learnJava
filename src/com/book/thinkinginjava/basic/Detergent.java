package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/1
 */
public class Detergent  extends Cleanser{
    /**
     * Change a method
     */
    @Override
    public void scrub() {
        append(" Detergent scrub()");
        super.scrub();
    }

    /**
     * Add a method
     */
    public void foam() { append(" foam()"); }

    /**
     * Test the base class
     */
    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println("Test base class");
        Cleanser.main(args);
    }
}

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    @Override
    public String toString() { return s; }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }
}
