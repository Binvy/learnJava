package com.book.thinkinginjava.classInfo;

import java.util.Arrays;

/**
 * @comments: instanceOf 与 Class的等价性
 * @author: binvy
 * @Date: 2018/3/21
 */
public class FamilyVsExactType {
    public static void test(Object o) {
        System.out.println("Testing x of type: " + o.getClass());
        System.out.println("o instanceOf Base: " + (o instanceof Base));
        System.out.println("o instanceOf Derive: " + (o instanceof Derive));
        System.out.println("Base.isInstance(o): " + Base.class.isInstance(o));
        System.out.println("Derive.isInstance(o): " + Derive.class.isInstance(o));
        System.out.println("o.getClass() == Base.class: " + (o.getClass() == Base.class));
        System.out.println("o.getClass() == Derive.class: " + (o.getClass() == Derive.class));
        System.out.println("o.getClass().equals(Base.class): " + (o.getClass().equals(Base.class)));
        System.out.println("o.getClass().equals(Derive.class): " + (o.getClass().equals(Derive.class)));
    }
    public static void main(String[] args) {
        test(new Base());
        test(new Derive());
    }
}

class Base {}
class Derive extends Base {}
