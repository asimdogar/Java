package com.company;

/**
 * The BubbleSort program implements an application that
 * simply SORT Integer Array using Bubble Sort Algorithm
 *
 * @author  ASIM SALEEM DOGAR
 * @version 1.0
 * @since   2017-11-09
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Input Array
        int []Array={1,2,3,4,5,6,7,8};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(Array);
    }
}
