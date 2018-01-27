package com.tstar.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/1/28 0028
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 3, 6, 7, 10, 23, 55, 66, 77, 88, 99, 100};
        int key = binarySearch(list, 55);
        System.out.println(key);
    }


    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}
