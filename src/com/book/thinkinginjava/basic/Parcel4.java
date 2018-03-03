package com.book.thinkinginjava.basic;

/**
 * @comments: 作用域内嵌入内部类
 * @author: binvy
 * @Date: 2018/3/3
 */
public class Parcel4 {
    private void internalTracking(boolean b) {
        if(b) {
            class TrackingSlip {
                private String slip;
                TrackingSlip(String slip) {
                    this.slip = slip;
                }
                public String getSlip() {
                    return slip;
                }
            }
            TrackingSlip trackingSlip = new TrackingSlip("Tasmania");
            String label = trackingSlip.getSlip();
        }
        // Can't use it here! Out of scope;
        // ! TrackingSlip ts = new TrackingSlip("Tasmania");
    }
    public void track() {
        internalTracking(true);
    }
    public static void main(String[] args) {
        Parcel4 parcel4 = new Parcel4();
        parcel4.track();
    }
}
