package com.book.thinkinginjava.genericity;

/**
 * @comments: 元祖类测试
 * @author: binvy
 * @Date: 2018/3/31
 */
class Amphibian {}
class Vihicle {}

public class TestTuple {
    static TwoCouple<String, Integer> f() {
        return new TwoCouple<>("hi", 47);
    }
    static ThreeCouple<String, Integer, Double> g() {
        return new ThreeCouple<>("hi", 47, 11.1);
    }
    static FourCouple<Amphibian, String, Integer, Double> h() {
        return new FourCouple<>(new Amphibian(), "hi", 47, 11.1);
    }
    static FiveCouple<Vihicle, Amphibian, String, Integer, Double> k() {
        return new FiveCouple<>(new Vihicle(), new Amphibian(), "hi", 47, 11.1);
    }
    public static void main(String[] args) {
        TwoCouple<String, Integer>  tuple = f();
        System.out.println(tuple);
        // tuple.a = "hello"; // compile error: final
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
