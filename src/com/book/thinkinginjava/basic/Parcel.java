package com.book.thinkinginjava.basic;

import sun.security.krb5.internal.crypto.Des;

/**
 * @comments: 创建内部类
 * @author: binvy
 * @Date: 2018/3/3
 */
public class Parcel {
    class Contents {
       private int value = 11;
       public int value() {
           return value;
       }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }
    public Contents contents() {
        return new Contents();
    }
    public Destination destination(String s) {
        return new Destination(s);
    }
    public void ship(String dest) {
        Contents contents = contents();
        Destination destination = destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship("Tasmania");
        Parcel q = new Parcel();
        Parcel.Contents contents = q.contents();
        Parcel.Destination destination = q.destination("Borneo");
    }
}
