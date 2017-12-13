package com.company;

/**
 * Created by ASIM on 12/12/2017.
 */
public class Sorting {

    public  int[] quick_sort(int[] array, int p, int r) {
        /*
		 * fill in your program
		 */
        if (p < r) {
            int q = partition(array, p, r);
            quick_sort(array, p, q - 1);
            quick_sort(array, q + 1, r);
        }
        return array;
    }

    public  int partition(int[] array, int p, int r) {
		/*
		 * fill in your program
		 */

        int x = array[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (array[j] <= x) {

                i = i + 1;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //swap
        int temp = array[i + 1];
        array[i + 1] = array[r];
        array[r] = temp;
        return i + 1;

    }
}
