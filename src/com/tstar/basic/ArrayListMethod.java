package com.tstar.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @comments: some method about ArrayList
 * @author: binvy
 * @Date: 2018/1/31 0031
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        // create a list;
        ArrayList<String> list = new ArrayList<>();

        // add(o: E);
        list.add("Beijing");
        list.add("Shanghai");
        list.add("Chongqing");

        // add(index: int, o: E);
        list.add(1, "Tianjin");

        // contains(o: Object);
        list.contains("Beijing");
        System.out.println("Is list contains 'Beijing'? " + "\n" + list.contains("Beijing"));

        // get(index: int);
        list.get(2);
        System.out.println("The thrid city in the list is: " + "\n" + list.get(2));

        // indexOf(o: Object);
        list.indexOf("Chongqing");
        System.out.println("which index is Chongqing in the list: " + "\n" + list.indexOf("Chongqing"));

        // isEmpty();
        list.isEmpty();
        System.out.println("The list is empty: " + "\n" + list.isEmpty());

        // lastIndexOf(o: Object);
        list.lastIndexOf("Shanghai");
        System.out.println("The last index of the 'Shanghai' in the list is:" + "\n" + list.lastIndexOf("Shanghai"));

        // remove(o: Object);
        list.remove("Chongqing");

        // remove(index: int);
        list.remove(1);

        // set(index: int, o: E);
        list.set(1, "Chongqing");

        // size();
        list.size();
        System.out.println("The size of list is: " + "\n" + list.size());

        // transfer Array to ArrayList
        String[] array = {"red", "orange", "yellow", "green", "blue", "indigo", "purple",};
        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(array));

        // transfer ArrayList to Array
        String[] strArray = new String[colorList.size()];
        colorList.toArray(strArray);

        // sort();
        Integer[] intArray = {3, 4, 5, 0, 1, 2, 7, 6, 9, 8};
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        Collections.sort(intList);
        System.out.println("sort the intList: " + "\n" + intList);

        // max();
        Collections.max(intList);
        System.out.println("The max value in the intList is: " + "\n" + Collections.max(intList));

        // min();
        Collections.min(intList);
        System.out.println("The min value in the intList is: " + "\n" + Collections.min(intList));

        // shuffle
        Collections.shuffle(intList);
        System.out.println("Shuffle the intList:" + "\n" + intList);

    }
}
