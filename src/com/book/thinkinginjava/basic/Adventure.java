package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/2
 */
public class Adventure {
    public static void ft(CanFight obj) {
        obj.fight();
    }
    public static void fta(ActionCharacter obj) {
        obj.fight();
    }
    public static void fy(CanFly obj) {
        obj.fly();
    }
    public static void s(CanSwim obj) {
        obj.swim();
    }
    public static void r(CanRun obj) {
        obj.run();
    }

    public static void main(String[] args) {
        Superman superman = new Superman();
        ft(superman);
        fta(superman);
        fy(superman);
        s(superman);
        r(superman);
    }
}

interface CanFight {
    void fight();
}

interface CanFly {
    void fly();
}

interface CanSwim {
    void swim();
}

interface CanRun {
    void run();
}

class ActionCharacter {
    public void fight(){
        System.out.println("ActionCharacter.fight()");
    }
}

class Superman extends ActionCharacter implements CanFight, CanFly, CanRun, CanSwim {

    @Override
    public void fly() {
        System.out.println("Superman.fly()");
    }

    @Override
    public void swim() {
        System.out.println("Superman.swim()");
    }

    @Override
    public void run() {
        System.out.println("Superman.run()");
    }
}
