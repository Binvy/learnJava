package com.book.thinkinginjava.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @comments: 注解处理器
 * @author: binvy
 * @Date: 2018/7/28
 */
public class UseCaseTracker {
    public static void tracker(List<Integer> idList, Class<?> clazz) {
        for ( Method method : clazz.getDeclaredMethods() ) {
            UseCase annotation = method.getAnnotation(UseCase.class);
            if (annotation != null) {
                System.out.println("Found the annotation: id=" +  annotation.id() + " description: " + annotation.description());
                idList.remove(new Integer(annotation.id()));
            }
        }
        for (Integer i :  idList ) {
            System.out.println("Missing the annotation: id= " + i);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 47, 48, 49, 50);
        tracker(list, PasswordUtil.class);
    }
}
