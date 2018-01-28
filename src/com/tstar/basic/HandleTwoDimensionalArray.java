package com.tstar.basic;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @comments: method about handle twodimensional array
 * @author: binvy
 * @Date: 2018/1/28 0028
 */
public class HandleTwoDimensionalArray {
    public static void main(String[] args) {
        // main method
        // double[][] matrix = getTwoDimensionalArrayWithScannerInput(2,3);
        double[][] matrix = getTwoDimensionalArrayWithRandomNumbers(5,5);
        // display the two dimensional array
        print(matrix);
        System.out.println("****************************************");
        System.out.println("The sum of the two dimensional array is: " + sumTwoDimensionalArray(matrix));

        System.out.println("****************************************");
        sumTwoDimensionalArrayEachRow(matrix);

        System.out.println("****************************************");
        sumTwoDimensionalArrayEachColumn(matrix);

        System.out.println("****************************************");
        getRowNoWithMaxSumTotalInTwoDimensionalArray(matrix);

    }

    /** print the two dimensional array */
    public static void print(double[][] matrix) {
        for ( int i = 0; i < matrix.length; i++ ) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    /** init two dimensional array with scanner input */
    public static double[][] getTwoDimensionalArrayWithScannerInput(int i, int j) {
        // create a new double two dimensional array with i rows, j columns
        double[][] matrix = new double[i][j];
        // create a scanner object
        Scanner input = new Scanner(System.in);
        // prompt user enter double values
        System.out.println("Enter some values as you want:");
        // assign the input value into the array
        for ( int m = 0; m < i; m++ ) {
            for ( int n = 0; n < j; n++ ) {
                matrix[m][n] = input.nextDouble();
            }
        }
        // return the two dimensional array
        return matrix;
    }

    /** init two dimensional array with random numbers  */
    public static double[][] getTwoDimensionalArrayWithRandomNumbers(int i, int j) {
        double[][] matrix = new double[i][j];
        for ( int m = 0; m < matrix.length; m++ ) {
            for ( int n = 0; n < matrix[m].length; n++ ) {
                matrix[m][n] = Math.random() * (i * j);
            }
        }
        return matrix;
    }

    /** sum the numbers in the two dimensional array */
    public static double sumTwoDimensionalArray(double[][] matrix) {
        double sum = new Double(0);
        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix[i].length; j++ ) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    /** sum the two dimensional array in each row */
    public static void sumTwoDimensionalArrayEachRow(double[][] matrix) {
        for ( int i = 0; i < matrix.length; i++ ) {
            double sumRow = new Double(0);
            for ( int j = 0; j < matrix[i].length; j++ ) {
                sumRow += matrix[i][j];
            }
            System.out.println("the sum of " + (i + 1) + " row in the array is: " + sumRow );
        }
    }

    /** sum the two dimensional array in each column */
    public static void sumTwoDimensionalArrayEachColumn(double[][] matrix) {
        for ( int i = 0; i < matrix[0].length; i++ ) {
            double sumColumn = new Double(0);
            for ( int j = 0; j < matrix.length; j++ ) {
                sumColumn += matrix[j][i];
            }
            System.out.println("the sum of " + (i + 1) + " column in the array is: " + sumColumn);
        }
    }

    /** which row has the max sum total  */
    public static void getRowNoWithMaxSumTotalInTwoDimensionalArray(double[][] matrix) {
        int index = 0;
        double maxSum = new Double(0);
        //
        for ( int i = 0; i < matrix[0].length; i++ ) {
            maxSum += matrix[0][i];
        }

        for ( int i = 1; i < matrix.length; i++ ) {
            double currSum = new Double(0);
            for ( int j = 0; j < matrix[i].length; j++ ) {
                currSum += matrix[i][j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                    index = i;
                }
            }
        }

        System.out.println("The index is: " + (index + 1) + "; max sum is:" + maxSum);
    }

    /** upset the two dimensional array with no rules */
    public static void upsetTwoDimensionalArray(double[][] matrix) {
        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix[i].length; j++ ) {
                int m = (int) (Math.random() * matrix.length);
                int n = (int) (Math.random() * matrix[i].length);

                double temp = matrix[i][j];
                matrix[i][j] = matrix[m][n];
                matrix[m][n] = temp;
            }
        }
    }
}
