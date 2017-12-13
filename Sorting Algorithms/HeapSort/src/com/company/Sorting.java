package com.company;

/**
 * Created by ASIM on 12/12/2017.
 */
public class Sorting {
    public static int left(int i) {
        /*
         * fill in your program
		 */
        return 2 * i + 1;
    }

    public static int right(int i) {
        /*
         * fill in your program
		 */
        return 2 * i + 2;
    }

    public static int parent(int i) {
		/*
		 * fill in your program
		 */
        return (i - 1) / 2;
    }

    public static int[] max_heapify(int[] array, int heap_size, int i) {
		/*
		 * fill in your program
		 */
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l <= heap_size && array[l] > array[i]) {
            largest = l;
        }
        if (r <= heap_size && array[r] > array[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp =array[i];
            array[i] = array[largest];
            array[largest]=temp;
            max_heapify(array, heap_size, largest);
        }
        return array;
    }

    public static int[] build_heap(int[] array) {
		/*
		 * fill in your program
		 */
        int heap_size = array.length - 1;
        for (int i = heap_size / 2; i >= 0; i--) {
            max_heapify(array, heap_size, i);
        }
        return array;
    }

    public static int[] heap_sort(int[] array) {
		/*
		 * fill in your program
		 */
        int heap_size = array.length - 1;
        build_heap(array);
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heap_size = heap_size - 1;
            max_heapify(array, heap_size, 0);
        }
        return array;
    }
}
