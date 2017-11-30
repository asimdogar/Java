package com.company;

import java.util.Arrays;

/**
 * The SelectionSort program implements an application that
 * simply SORT Integer Array using SelectionSort Sort Algorithm
 *
 * @author  ASIM SALEEM DOGAR
 * @version 1.0
 * @since   2017-11-09
 */

public class SelectionSort {
    /**
     * Bubble SelectionSort's sort function sort Array Using SelectionSort Algorithm.
     * @param inputArray Integer Input Array may be sorted or unsorted.
     * @return return An Sorted Array in ascending Order.
     */

    public int[] sort(int []inputArray){
        int size=inputArray.length;
        for(int i=0;i<size-2;i++){
            System.out.println(Arrays.toString(inputArray));
            int iMin=i;
            for (int j=i+1;j<size;j++){
                if (inputArray[j]<inputArray[iMin]){
                    iMin=j;
                }
            }
            int temp=inputArray[i];
            inputArray[i]=inputArray[iMin];
            inputArray[iMin]=temp;

            System.out.println(Arrays.toString(inputArray));
        }
        return inputArray;
    }
}
