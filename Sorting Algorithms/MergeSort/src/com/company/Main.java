package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []array={6,5,4,3,2,1};
        Sorting sort = new Sorting();
        System.out.print(Arrays.toString(sort.merge_sort(array,0, array.length-1)));
    }
}
