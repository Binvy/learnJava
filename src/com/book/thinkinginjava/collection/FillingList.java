package com.book.thinkinginjava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @comments: 容器-填充
 * @author: binvy
 * @Date: 2018/4/19
 */
class StringAddress {
    private String address;
    public StringAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return super.toString() + " " + address;
    }
}
public class FillingList {
    public static void main(String[] args) {
        ArrayList<StringAddress> list = new ArrayList<>(Collections.nCopies(5, new StringAddress("biu")));
        System.out.println(list);
        Collections.fill(list, new StringAddress("tu"));
        System.out.println(list);
    }
}
