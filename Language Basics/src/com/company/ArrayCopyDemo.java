package com.company;

import java.util.Arrays;

class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));

        int[] anArray = {1, 2, 3, 4, 5};
        int[] anArray2 = {5, 6, 7, 8, 2};
        System.arraycopy(anArray, 0, anArray2, 0, 5);
        System.out.println(Arrays.toString(anArray2));


        char[] copyFrom2 = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo2 = java.util.Arrays.copyOfRange(copyFrom2, 2, 9);
        //Note that the second parameter of the copyOfRange method is the initial index of the range to be copied, inclusively,
        //while the third parameter is the final index of the range to be copied, exclusively.
        System.out.println(new String(copyTo2));
    }
}