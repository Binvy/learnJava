package com.book.thinkinginjava.basic;

import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * @comments: 鼎盾面试题：两个不同的字符串中获取并输出相同元素以及各自不同的元素。
 * @author: binvy
 * @Date: 2018/3/5
 */
public class StringCompare {
    public static void main(String[] args) {
        String str1 = "hij, kml, abc, nop, def, qrs, tuv, xyz, abc, def, abc, def";
        String str2 = "hij, tom, opq, david, abc, abc, tuv, def, tom";

        List<String> lst = new ArrayList<>(new HashSet<>(Arrays.asList(str1.split(","))));
        List<String> lst1 = new ArrayList<>(new HashSet<>(Arrays.asList(str1.split(","))));
        List<String> lst2 = new ArrayList<>(new HashSet<>(Arrays.asList(str2.split(","))));

        lst.retainAll(lst2);
        lst1.removeAll(lst);
        lst2.removeAll(lst);

        System.out.println("共同的字符串：" + StringUtils.join(lst,","));
        System.out.println("s1独有的字符串：" + StringUtils.join(lst1,","));
        System.out.println("s2独有的字符串：" + StringUtils.join(lst2,","));

    }
}
