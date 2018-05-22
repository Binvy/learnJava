package com.book.thinkinginjava.collection;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @comments: Stack
 * @author: binvy
 * @Date: 2018/5/22
 */
public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (Month month : Month.values()) {
            stack.push(month.toString());
        }
        System.out.println("stack = " + stack);

        // Treating a stack as a Vector
        stack.addElement("DECEMBER");
        System.out.println("element[6] = " + stack.elementAt(6));
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        // Using a LinkedList as a Vector
        LinkedList<String> linkedList = new LinkedList<>();
        for (Month month : Month.values()) {
            linkedList.addFirst(month.toString());
        }
        System.out.println("LinkedList " + linkedList);
        while (!linkedList.isEmpty()) {
            System.out.print(linkedList.removeFirst() + " ");
        }
    }
}
enum Month{
    JANUARY, FEBRUARY, MATCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER
}

