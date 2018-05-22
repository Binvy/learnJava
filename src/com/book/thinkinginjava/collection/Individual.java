package com.book.thinkinginjava.collection;

/**
 * @comments: 散列码
 * @author: binvy
 * @Date: 2018/4/23
 */
public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;
    public Individual(String name) {
        this.name = name;
    }
    public Individual() {}

    @Override
    public String toString() {
        return getClass().getSimpleName() + (name == null ? "" : " " + name);
    }
    @Override
    public int hashCode() {
        int result = 17;
        if (name != null) {
            result = result * 37 + name.hashCode();
        }
        result = result * 37 + (int)id;
        return result;
    }
    @Override
    public int compareTo(Individual arg) {
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if (firstCompare != 0) {
            return firstCompare;
        }
        if (name != null && arg.name != null) {
            int secondCompare = name.compareTo(arg.name);
            if (secondCompare != 0) {
                return secondCompare;
            }
        }
        return (arg.id < id ? -1 : (arg.id == id ? 0 : 1));
    }
}
