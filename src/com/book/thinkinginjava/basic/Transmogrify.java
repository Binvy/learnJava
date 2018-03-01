package com.book.thinkinginjava.basic;

/**
 * @comments: 纯继承与扩展
 * @author: binvy
 * @Date: 2018/3/2
 */
public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}

class Actor {
    void act() {
        System.out.println("Actor.act()");
    }
}

class HappyActor extends Actor {
    @Override
    void act() {
        System.out.println("HappyActor.act()");
    }
}

class SadActor extends Actor {
    @Override
    void act() {
        System.out.println("SadActor.act()");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        actor = new SadActor();
    }
    public void performPlay() {
        actor.act();
    }
}