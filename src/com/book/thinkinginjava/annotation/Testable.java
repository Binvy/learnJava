package com.book.thinkinginjava.annotation;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/7/28
 */
public class Testable {
    public void execute() {
        System.out.println("Executing...");
    }
    @Test void testExecute(){
        execute();
    }
}
