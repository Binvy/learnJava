package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/2
 */
public class Music2 {
    static void tune(Instrument2 instrument2) {
        instrument2.play(Note.B);
    }
    static void tuneAll(Instrument2[] instrument2s) {
        for ( Instrument2 instrument2 : instrument2s ) {
            tune(instrument2);
        }
    }

    public static void main(String[] args) {
        Instrument2[] instrument2s = {new Wind2(), new Percussion2(), new Stringed2(), new Brass2(), new Woodwind2()};
        tuneAll(instrument2s);
    }

}

interface Instrument2 {
    /**
     * static & final
     */
    int VALUE = 5;

    /**
     *  Automatically public
     */
    void play(Note note);
    void adjust();
}

class Wind2 implements Instrument2{
    @Override
    public void play(Note note) {
        System.out.println(this + ".play()" + note);
    }
    @Override
    public String toString() {
        return "Wind2";
    }
    @Override
    public void adjust() {
        System.out.println("Wind2.adjust()");
    }
}

class Percussion2 implements Instrument2{
    @Override
    public void play(Note note) {
        System.out.println("Percussion2.play()" + note);
    }
    @Override
    public String toString() {
        return "Percussion2";
    }
    @Override
    public void adjust() {
        System.out.println("Percussion2.adjust()");
    }
}

class Stringed2 implements Instrument2 {

    @Override
    public void play(Note note) {
        System.out.println("Stringed2.play()" + note);
    }
    @Override
    public String toString() {
        return "Stringed2";
    }
    @Override
    public void adjust() {
        System.out.println("Stringed2.adjust()");
    }
}

class Brass2 extends Wind2 {
    @Override
    public String toString() {
        return "Brass2";
    }
}

class Woodwind2 extends Wind2 {
    @Override
    public String toString() {
        return "Woodwind2";
    }
}