package com.company;
import java.util.Arrays;

/**
 * The BubbleSort program implements an application that
 * simply SORT Integer Array using Bubble Sort Algorithm
 *
 * @author  ASIM SALEEM DOGAR
 * @version 1.0
 * @since   2017-11-09
 */
public class BubbleSort {
	
    /**
     * Bubble Sort Algorithm's sort function sort Array Using bubble sort Algorithm.
     * @param inputArray Integer Input Array may be sorted or unsorted.
     * @return return An Sorted Array in ascending Order.
     */

    public int[] sort(int [] inputArray){
        //Number of elements in Array.
        int size=inputArray.length;
        //flag for test is Array is already sorted or not?
        boolean alreadySorted=true;

        for (int i=0;i<size-1;i++){
            for (int j=0;j<size-1-i;j++){
                if (inputArray[j]>inputArray[j+1]){
                    int temp =inputArray[j];
                    inputArray[j]=inputArray[j+1];
                    inputArray[j+1]=temp;
                    alreadySorted = false;
                }
            }
            System.out.println(Arrays.toString(inputArray));
            if (alreadySorted){
                break;
            }

        }

        return inputArray;
    }
}

