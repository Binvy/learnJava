package com.book.thinkinginjava.basic;

import java.util.Random;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/1
 */
public class Shapes {
    private static RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for ( int i = 0; i < shapes.length; i++ ) {
            shapes[i] = randomShapeGenerator.next();
        }
        for ( Shape shape : shapes ) {
            shape.draw();
            shape.erase();
            System.out.println("********    next shape      *******");
        }
    }
}

class Shape{
    public void draw(){
        System.out.println("Shape draw()");
    }
    public void erase() {
        System.out.println("Shape erase()");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle draw()");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square erase()");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase()");
    }
}

/**
 *  随机生成图形的工厂类
 */
class RandomShapeGenerator{
    private Random random = new Random(47);
    public Shape next() {
        switch (random.nextInt(3)) {
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
            default: return new Shape();
        }
    }
}
