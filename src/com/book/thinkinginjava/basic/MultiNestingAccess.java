package com.book.thinkinginjava.basic;

/**
 * @comments: 从多层嵌套类中访问外部类的成员
 * @author: binvy
 * @Date: 2018/3/3
 */
class MNA {
    private void f() {}
    class A {
        private void g() {}
        public class B {
            void h() {
                f();
                g();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
