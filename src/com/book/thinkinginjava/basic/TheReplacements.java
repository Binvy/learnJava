package com.book.thinkinginjava.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @comments: 替换操作
 * @author: binvy
 * @Date: 2018/3/7
 */
public class TheReplacements {
    public static void main(String[] args) {
        String s = "a. b. c. d. e. f. g. h. i. j. k. l. m. n. o. p. q. r. s. t. u. v. w. x. y. z. ";
        Matcher matcher = compile("/\\*!(.*)!\\*/", DOTALL).matcher(s);
        if (matcher.find()) {
            s = matcher.group(1);
        }
        s = s.replaceAll(" {2,}", " ");
        s = s.replaceAll("(?m)^+", " ");
        System.out.println(s);
        s = s.replaceFirst("[aeoui]]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = compile("[aeiou]]");
        Matcher m = p.matcher(s);
        while (m.find()) {
            m.appendReplacement(sbuf, m.group().toUpperCase());
        }
        m.appendTail(sbuf);
        System.out.println(sbuf);
    }
}
