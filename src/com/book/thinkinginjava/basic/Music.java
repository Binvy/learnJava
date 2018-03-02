package com.book.thinkinginjava.basic;

/**
 * @comments: 抽象类与抽象方法
 * @author: binvy
 * @Date: 2018/3/2
 */
public class Music {
    static void tune(Instrument instrument) {
        instrument.play(Note.A);
    }

    static void tuneAll (Instrument[] instruments) {
        for ( Instrument instument : instruments ) {
            tune(instument);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}

enum Note {
    A, B, C, D, E, F, G
}

abstract class Instrument {
    private int i;
    public abstract void play(Note note);
    public String what() {
        return "Instrument";
    }
    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play()" + note);
    }
    public String What() {
        return "Wind";
    }
    @Override
    public void adjust() {
        System.out.println("Wind.adjust");
    }
}

class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Percussion.play()" + note);
    }
    public String What() {
        return "Percussion";
    }
    @Override
    public void adjust() {
        System.out.println("Percussion.adjust");
    }
}

class Stringed extends Instrument {

    @Override
    public void play(Note note) {
        System.out.println("Stringed.play()" + note);
    }
    public String What() {
        return "Stringed";
    }
    @Override
    public void adjust() {
        System.out.println("Stringed.adjust()");
    }
}

class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play()" + note);
    }
    @Override
    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play()" + note);
    }
    @Override
    public String what() {
        return "Woodwind";
    }
}