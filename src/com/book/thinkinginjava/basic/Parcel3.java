package com.book.thinkinginjava.basic;

/**
 * @comments: 局部内部类
 * @author: binvy
 * @Date: 2018/3/3
 */
interface Destination3 {}

public class Parcel3 {
    public Destination3 destination(String dest) {
        class PDestination3 implements Destination3 {
            private String label;
            private PDestination3(String label) {
                this.label = label;
            }
            public String readLabel() {
                return label;
            }
        }
        return new PDestination3("Tasmania");
    }
    public static void main(String[] args) {
        Parcel3 parcel3 = new Parcel3();
        Destination3 desctination3 = parcel3.destination("Tasmania");
    }
}
