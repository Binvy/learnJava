package com.interview;

import java.util.*;
/**
 * @comments: 统计数组中出现的次数，并且按照出现的次数排序打印输出
 * {2, 1, 2, 3, 4, 2, 1, 3, 2}
 *  输出 2出现了4次 1出现了2次 3出现了2次 4出现了1次
 * @author: binvy
 * @Date: 2018/3/17
 */
public class SortArray {
    public static void sort(int[] arrays) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i : arrays) {
          if (map.containsKey(i)) {
              map.put(i, map.get(i) + 1);
          } else {
              map.put(i, 1);
          }
        }
        System.out.println(map.toString());
        sortMapByValue(map);
    }

    public static void sortMapByValue(HashMap<Integer, Integer> map) {
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        Integer[] values = map.values().toArray(new Integer[0]);
        int tempKey, tempValue, count, length = values.length;
        for ( int i = 0; i < length - 1; i++ ) {
            count = 0;
            for ( int j = 0; j < length - i - 1; j++ ) {
                if (values[j] < values[j + 1]) {
                    tempKey = keys[j + 1];
                    tempValue = values[j + 1];
                    keys[j + 1] = keys[j];
                    values[j + 1] = values[j];
                    keys[j] = tempKey;
                    values[j] = tempValue;
                    count = 1;
                }
            }
            if (count == 0) {
                break;
            }
        }
        for ( int i = 0; i < length; i++ ) {
            System.out.println(keys[i] + "出现了" + values[i] + "次");
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[20];
        Random random = new Random(47);
        for ( int i = 0; i < arrays.length; i++ ) {
            arrays[i] = random.nextInt(10);
        }
        for ( int i: arrays) {
            System.out.print(i  + " ");
        }
        System.out.println(arrays);
        sort(arrays);
    }
}
