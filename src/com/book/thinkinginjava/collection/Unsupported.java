package com.book.thinkinginjava.collection;

import java.util.*;

/**
 * @comments: Collection-可选操作
 * @author: binvy
 * @Date: 2018/4/20
 */
public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("---" + msg + "---");
        Collection<String> c = list;
        List<String> subList = list.subList(1, 8);
        Collection<String> c2 = new ArrayList<>(subList);
        try { c.retainAll(c2); } catch (Exception e){ System.out.println("retainAll(): " + e);}
        try { c.removeAll(c2); } catch (Exception e){ System.out.println("removeAll(): " + e);}
        try { c.clear(); } catch (Exception e){ System.out.println("clear(): " + e);}
        try { c.add("X"); } catch (Exception e){ System.out.println("add(): " + e);}
        try { c.addAll(c2); } catch (Exception e){ System.out.println("addAll(): " + e);}
        try { c.remove("C"); } catch (Exception e){ System.out.println("remove(): " + e);}
        try { list.set(0, "X"); } catch (Exception e){ System.out.println("list.set(): " + e);}
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" "));
        test("Modifiable Copy", new ArrayList<>(list));
        test("Arrays.asList", list);
        test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<>(list)));
    }
}
