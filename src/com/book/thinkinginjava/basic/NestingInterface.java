package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/2
 */
public class NestingInterface {
    public class BImp implements A.B {

        @Override
        public void f() {
            System.out.println("BImp implements A.B  .f()");
        }
    }
    class CImpl implements A.C {

        @Override
        public void f() {
            System.out.println("CImp implements A.C  .f()");
        }
    }

    // cannot implements a private interface except within that interface's defining class
    // ! class DImp implements A.D {}

    class EImp implements E {

        @Override
        public void g() {
            System.out.println("EImp implements E .g()");
        }
    }

    class EGImpl implements E.G {

        @Override
        public void f() {
            System.out.println("EGImpl implements E.G .f()");
        }
    }

    class EImp2 implements E {

        @Override
        public void g() {
            System.out.println("EImp2 implements E .g()");
        }
        class EG implements E.G {

            @Override
            public void f() {
                System.out.println("EG implements E.G in class EImp2 implements E .f()");
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        // Cannot access A.D;
        // ! A.D ad = a.getD();
        // Does't return anything but A.D;
        // ! A.DImpl2 di2 = a.getD();
        // Cannot access a member of the interface;
        // ! a.getD().f();
        // Only another A can do anything with getD();
        A a2 = new A();
        a2.receiveD(a.getD());

    }
}

class A {
    interface B {
        void f();
    }
    public class BImp implements B {

        @Override
        public void f() {
            System.out.println("Bimp.f()");
        }
    }
    public class BImp2 implements B {

        @Override
        public void f() {
            System.out.println("BImp2.f()");
        }
    }

    public interface C {
        void f();
    }
    public class CImp implements C {

        @Override
        public void f() {
            System.out.println("CImp.f()");
        }
    }
    public class CImp2 implements C {

        @Override
        public void f() {
            System.out.println("CImp2.f()");
        }
    }
    private interface D {
        void f();
    }
    public class DImpl implements D {

        @Override
        public void f() {
            System.out.println("DImpl.f()");
        }
    }

    public class DImpl2 implements D {

        @Override
        public void f() {
            System.out.println("DImpl2.f()");
        }
    }

    public D getD() {
        return new DImpl2();
    }
    private D dRef;
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }
    public interface H {
        void f();
    }
    void g();
    // cannot be private within an interface;
    // ! private interface I { };
}
