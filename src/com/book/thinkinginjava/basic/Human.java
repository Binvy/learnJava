package com.book.thinkinginjava.basic;

/**
 * @comments: 异常匹配：基类异常会覆盖子类（派生类）异常
 * @author: binvy
 * @Date: 2018/3/6
 */
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}
public class Human {
    public static void main(String[] args) {
        // Catch the exact type
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught sneeze");
        } catch (Annoyance annoyance) {
            System.out.println("Caught annoyance");
        }
        // Catch the base type
        try {
            throw new Sneeze();
        } catch (Annoyance annoyance) {
            System.out.println("Caught Annoyance");
        }
    }
}
