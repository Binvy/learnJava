package com.book.thinkinginjava.basic;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @comments: 异常与日志记录
 * @author: binvy
 * @Date: 2018/3/6
 */
public class LoggingException2 {
    private static Logger logger = Logger.getLogger("LoggingException2");
    public static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }
    }
}
