package com.book.thinkinginjava.genericity;

import java.util.*;
import java.lang.reflect.Method;

/**
 * @comments: 打印java.util包中各种Collection类与Map类之间的方法差异
 * @author: binvy
 * @Date: 2018/4/2
 */
public class ContainerMethodDifference {
    static Set<String> methodSet(Class<?> type) {
        Set<String> set = new TreeSet<>();
        for ( Method m : type.getMethods()
               ) {
            set.add(m.getName());
        }
        return set;
    }
    static void interfaces(Class<?> type) {
        System.out.println("Interfaces in " + type.getSimpleName() + ": ");
        List<String> result = new ArrayList<>();
        for ( Class<?> c : type.getInterfaces()
               ) {
            result.add(c.getSimpleName());
        }
        System.out.println(result);
    }
    static Set<String> object = methodSet(Object.class);
    static {
        object.add("clone");
    }
    static void difference(Class<?> superset, Class<?> subset) {
        System.out.println(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
        Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
        comp.removeAll(object);
        System.out.println(comp);
        interfaces(superset);
    }

    public static void main(String[] args) {
        System.out.println("Collection: " + methodSet(Collection.class));
        interfaces(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
        difference(List.class, Collection.class);
        difference(ArrayList.class, List.class);
        difference(LinkedList.class, List.class);
        difference(PriorityQueue.class, Queue.class);
        System.out.println("Map: " + methodSet(Map.class));
        difference(HashMap.class, Map.class);
        difference(LinkedHashMap.class, HashMap.class);
        difference(SortedMap.class, Map.class);
        difference(TreeMap.class, Map.class);
    }
}
