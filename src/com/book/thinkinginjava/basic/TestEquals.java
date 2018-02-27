package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/21
 */
public class TestEquals {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.age = 5;
        dog2.age = 5;
        dog1.name = "Baymax";
        dog2.name = "Baymax";
        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));

        Cat cat1 = new Cat();
        Cat cat2 = cat1;
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));
    }
}

class Dog{
    int age;
    String name;
    public boolean equals(Dog dog) {
         return this.age == dog.age && this.name == dog.name;
    }
}

class Cat{
    int age;
    String name;
}