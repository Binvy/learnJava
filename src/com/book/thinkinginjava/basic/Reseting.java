package com.book.thinkinginjava.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @comments: reset()
 * @author: binvy
 * @Date: 2018/3/7
 */
public class Reseting {
    public static void main(String[] args) {
        Matcher m = compile("[frb][aiu][gx]").matcher("fix me rug with bags");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();
        m.reset("fix the rig with rags");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }
}
