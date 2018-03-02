package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/2
 */
public class Factory {
    public static void serviceConsume(ServiceFactory factory) {
        Service service = factory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsume(new Implementation1Factory());
        serviceConsume(new Implementation2Factory());
    }
}

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {
    Implementation1() { }
    @Override
    public void method1() {
        System.out.println("Implementation1.method1()");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1.method2()");
    }
}

class Implementation1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation1();
    }
}

class Implementation2 implements Service {
    Implementation2() { }

    @Override
    public void method1() {
        System.out.println("Implementation2.method1()");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2.method2()");
    }
}

class Implementation2Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation2();
    }
}
