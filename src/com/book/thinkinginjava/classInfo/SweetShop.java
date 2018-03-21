package com.book.thinkinginjava.classInfo;

/**
 * @comments: Class对象
 * @author: binvy
 * @Date: 2018/3/21
 */
public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main method");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("com.book.thinkinginjava.classInfo.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("can not find Gum.class");
        }
        System.out.println("After creating Gum with Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating Cookie");
    }
}

class Candy {
    static {
        System.out.println("Loading Candy");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie {
    static {
        System.out.println("Loading Cookie");
    }
}
