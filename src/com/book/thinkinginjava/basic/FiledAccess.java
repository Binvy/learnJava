package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/3/1
 */
public class FiledAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.filed:" + sup.filed);
        System.out.println("sup.getFiled:" + sup.getFiled());

        Sub sub = new Sub();
        System.out.println("sub.filed:" + sub.filed);
        System.out.println("sub.getFiled:" + sub.getFiled());
        System.out.println("sub.getSuperFiled:" + sub.getSuperFiled());
    }
}

class Super {
    public int filed = 0;
    public int getFiled() {
        return filed;
    }
}

class Sub extends Super {
    public int filed = 1;
    @Override
    public int getFiled() {
        return filed;
    }
    public int getSuperFiled() {
        return super.filed;
    }
}
