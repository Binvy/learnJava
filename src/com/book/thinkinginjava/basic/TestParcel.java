package com.book.thinkinginjava.basic;

/**
 * @comments: 内部类与向上转型
 * @author: binvy
 * @Date: 2018/3/3
 */
interface Destination {
    String readLabel();
}
interface Contents {
    int value();
}

class Parcel2 {
    private class PContents implements Contents {
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }
    protected class PDestination implements Destination {
        private String label;
        private PDestination(String label) {
            this.label = label;
        }
        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String dest) {
        return new PDestination(dest);
    }
    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel2 parcel2 = new Parcel2();
        Contents contents = parcel2.contents();
        Destination destination = parcel2.destination("Tasmania");
        // Illegal -- can't access private class
        // ! Parcel2.PContents pc = p.new PContents();
    }
}
