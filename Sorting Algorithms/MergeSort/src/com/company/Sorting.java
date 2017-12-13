package com.company;

/**
 * Created by ASIM on 12/11/2017.
 */
public class Sorting {

    public static int[] merge_sort(int[] array, int p, int r) {
        /*
         * fill in your program
		 */
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(array, p, q);
            merge_sort(array, q + 1, r);
            merge(array, p, q, r);
        }
        return array;

    }

    public static int[] merge(int[] array, int p, int q, int r) {
        /*
         * fill in your program
		 */
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            left[i] = array[p + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = array[q + j + 1];
        }
        //Assign maximum values
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i = i + 1;
            } else {
                array[k] = right[j];
                j = j + 1;
            }
        }

        return array;

    }
}
