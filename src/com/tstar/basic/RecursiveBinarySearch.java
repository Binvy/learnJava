package com.tstar.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/6 0006
 */
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] list = {0, 11, 22, 33, 44, 55, 66, 77, 88, 99, 111, 222, 333, 444};
        int key = 88;
        System.out.println("the index of the " + key + " is:" + recursiveBinarySearch(list, key));
    }

    public static int recursiveBinarySearch (int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
        if (low > high) {
            return -low - 1;
        }
        int mid = (low + high) / 2;
        if (key < list[mid]) {
            return recursiveBinarySearch(list, key, low, mid - 1);
        } else if(key == list[mid]) {
            return mid;
        } else {
            return recursiveBinarySearch(list, key, mid + 1, high);
        }
    }
}
