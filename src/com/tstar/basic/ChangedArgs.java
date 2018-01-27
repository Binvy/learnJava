package com.tstar.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/1/28 0028
 */
public class ChangedArgs {
    public static void main(String[] args) {
        //pinrtMax(1.0, 2.0, 3.0, 1.2, 2.3, 23.0, 56.0, 100.0);
        printMax(new double[]{1.8, 5.7, 10.9, 23, 55});
    }

    private static void printMax(double...numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument");
            return;
        }

        double result = numbers[0];
        for ( int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is:" + result);
    }
}
