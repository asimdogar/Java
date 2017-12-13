package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sorting sort = new Sorting();
        int [] array={6,5,4,3,2,1};
        System.out.print(Arrays.toString(sort.quick_sort(array,0,array.length-1)));
    }
}
