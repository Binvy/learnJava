package com.book.thinkinginjava.classInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @comments: RTTI
 * @author: binvy
 * @Date: 2018/3/21
 */
public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        for ( Shape shape : shapes
               ) {
            shape.draw();
        }
    }
}

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw");
    }
    @Override
    abstract public String toString();
}

class Circle extends Shape {
    @Override
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    @Override
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    @Override
    public String toString() { return "Triangle"; }
}
