package com.book.thinkinginjava.basic;

/**
 * @comments: 异常丢失
 * @author: binvy
 * @Date: 2018/3/6
 */
class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "A very important exception!";
    }
}
class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial exception";
    }
}
public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lostMessage = new LostMessage();
            try {
                lostMessage.f();
            } finally {
                lostMessage.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
