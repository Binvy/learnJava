package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/2
 */
public class HorrorShow {
    static void u(Monster monster) {
        monster.menace();
    }
    static void v(DangerousMonster dangerousMonster) {
        dangerousMonster.menace();
        dangerousMonster.destroy();
    }
    static void w(Lethal lethal) {
        lethal.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vampire = new VeryBadVampire();
        u(vampire);
        v(vampire);
        w(vampire);
    }
}

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override
    public void menace() { }
    @Override
    public void destroy() { }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    @Override
    public void menace() { }
    @Override
    public void destroy() { }
    @Override
    public void kill() { }
    @Override
    public void drinkBlood() { }
}