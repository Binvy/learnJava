package com.book.thinkinginjava.basic;

import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 * @comments: 用正则表达式扫描
 * @author: binvy
 * @Date: 2018/3/7
 */
public class ThreatAnalyzer {
    static String threatData =
                "50.27.82.161@02/01/2005\n" +
                "51.28.82.161@02/02/2006\n" +
                "52.29.82.161@02/03/2007\n" +
                "53.30.82.161@02/04/2008\n" +
                "54.31.82.161@02/05/2009\n" +
                "55.32.82.161@02/06/2018\n" +
                "[Next log section with different data format]";

    public static void main(String[] args) {
        Scanner input = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4})";
        while (input.hasNext(pattern)) {
            input.next(pattern);
            MatchResult match = input.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s from %s\n", date, ip);
        }
    }
}
