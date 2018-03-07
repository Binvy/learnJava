package com.book.thinkinginjava.basic;

/**
 * @comments: String.format()
 * @author: binvy
 * @Date: 2018/3/7
 */
public class DataBaseException extends Exception{
    public DataBaseException(int transactionID, int queryID, String message) {
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new DataBaseException(3, 6, "Write faild");
        } catch (DataBaseException e) {
            System.out.println(e);
        }
    }
}
