package com.company;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int noOfRows = 6, noOfCol = 6, sum = 0, tempSum = 0;
        int[][] hoursArray = {{1, 1, 1}, {0, 1, 0}, {1, 1, 1}};
        int arr[][] = new int[noOfRows][noOfRows];

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfCol; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < noOfRows - 2; i++) {
            for (int j = 0; j < noOfCol - 2; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        tempSum = tempSum + arr[i + k][j + l] * hoursArray[k][l];
                    }
                }
                if (i == 0 && j == 0) {
                    sum = tempSum;
                } else if (tempSum > sum) {
                    sum = tempSum;
                }
                tempSum = 0;
            }
        }
        System.out.println(sum);
    }
}
