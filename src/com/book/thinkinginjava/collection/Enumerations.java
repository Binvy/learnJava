package com.book.thinkinginjava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @comments: Java 1.0/1.1 Vector and Enumeration
 * @author: binvy
 * @Date: 2018/5/22
 */
public class Enumerations {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(Countries.names(10));
        Enumeration<String> elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement() + " ");
        }
        // Produce an Enumeration from a Collection
        elements = Collections.enumeration(new ArrayList<String>());
    }
}
