package com.company;

/**
 * The SelectionSort program implements an application that
 * simply SORT Integer's Array using SelectionSort Sort Algorithm
 *
 * @author  ASIM SALEEM DOGAR
 * @version 1.0
 * @since   2017-11-09
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        SelectionSort sort= new SelectionSort();
        //Input integer Array
        int [] Array={9,8,7,6,5,4,3,2,1};
        sort.sort(Array);
    }
}
