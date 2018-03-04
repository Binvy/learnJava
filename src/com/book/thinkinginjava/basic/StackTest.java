package com.book.thinkinginjava.basic;

/**
 * @comments: Stack
 * @author: binvy
 * @Date: 2018/3/4
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for ( String str : "My dog has fleas".split(" ") ) {
            System.out.println(str);
            stack.push(str);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
