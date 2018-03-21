package com.interview;

/**
 * @comments: 二分法查找
 * @author: binvy
 * @Date: 2018/3/9
 */
public class BinarySearch {
    /**
     * 二分查找
     * @param nums 要查找的数组。
     * @param num 要查找的数值
     * @return
     */
    public static int search(int[] nums, int num) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = nums[mid];
            if (num < midValue) {
                high = mid - 1;
            } else if (num > midValue) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 19, 20, 50, 70, 83, 121, 1211};
        int result = search(nums, 20);
        System.out.println(result);

    }
}
