package com.tstar.basic;

import java.util.Arrays;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/1/28 0028
 */
public class SelectionSort {

    public static void main(String[] args) {
        double[] list = new double[]{4.4, 5.5, 6.6, 1.1, 2.2, 3.3 };
        Arrays.fill(list, 1, 5, 7.7);
        double[] sortlist = selectionSort(list);
        System.out.println(Arrays.toString(sortlist));
    }

    /** Selection sort */
    public static double[] selectionSort(double[] list){
        for ( int i = 0; i < list.length; i++ ) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for ( int j = i; j < list.length; j++ ) {
                if (list[j] < currentMin) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
}
