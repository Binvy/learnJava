package com.book.thinkinginjava.classInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @comments: Class添加泛型
 * @author: binvy
 * @Date: 2018/3/21
 */
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type) {
        this.type = type;
    }
    public List<T> create(int nElements) {
        List<T> list = new ArrayList<T>();
        try {
            for ( int i = 0; i < nElements; i++ ) {
                list.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static void main(String[] args) {
        FilledList<CountedInteger> fl = new FilledList<>(CountedInteger.class);
        System.out.println(fl.create(15));
    }
}

class CountedInteger {
    private static long counter;
    private final long id = counter++;
    @Override
    public String toString() {
        return Long.toString(id);
    }
}
