package com.book.thinkinginjava.basic;

/**
 * @comments: Specifying initial values in a class definition.
 * @author: binvy
 * @Date: 2018/2/27
 */
public class TestStaticInitialization {
    public static void main(String[] args) {
        System.out.println("Create a cupboard in main()");
        new Cupboard();
        System.out.println("Create a cupboard in main()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}

class Bowl {
    Bowl(int marker){
        System.out.println("Bowl(" + marker + ")");
    }
    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl = new Bowl(1);
    Table() {
        System.out.println("Table()");
        bow2.f1(1);
    }
    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }
    static Bowl bow2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

