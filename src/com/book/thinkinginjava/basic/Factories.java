package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/3
 */
interface Service1 {
    void method1();
    void method2();
}
interface ServiceFactory1 {
    Service1 getService1();
}
class Implementation11 implements Service1 {
    private Implementation11() {};
    @Override
    public void method1() {
        System.out.println("Implementation11.method1()");
    }
    @Override
    public void method2() {
        System.out.println("Implementation11.method2()");
    }
    public static ServiceFactory1 factory = new ServiceFactory1() {
        @Override
        public Service1 getService1() {
            return new Implementation11();
        }
    };
}
class Implementation12 implements Service1 {
    private Implementation12() {};
    @Override
    public void method1() {
        System.out.println("Implementation12.method1()");
    }
    @Override
    public void method2() {
        System.out.println("Implementation12.method2()");
    }
    public static ServiceFactory1 factory = new ServiceFactory1() {
        @Override
        public Service1 getService1() {
            return new Implementation12();
        }
    };
}

public class Factories {
    public static void serviceConsumer(ServiceFactory1 sf) {
        Service1 service1 = sf.getService1();
        service1.method1();
        service1.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation11.factory);
        serviceConsumer(Implementation12.factory);
    }
}
