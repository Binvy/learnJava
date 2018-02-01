package com.tstar.basic;

import java.util.Date;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/2 0002
 */
public class House implements Cloneable, Comparable<House> {

    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // shallow copy
        // return super.clone();
        // deep copy
        House houseClone = (House) super.clone();
        houseClone.whenBuilt = (Date) whenBuilt.clone();
        return houseClone;
    }

    @Override
    public int compareTo(House o) {
        if (area > o.area) {
            return 1;
        } else if (area < o.area) {
            return -1;
        } else {
            return 0;
        }
    }
}
