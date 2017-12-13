package com.company;

/**
 * Created by ASIM on 12/11/2017.
 */
public class Sorting {

    public  int[] insertionSort(int []array){

        for(int j=1; j<array.length;j++){
            int key =array[j];
            int i=j-1;
            while(i>=0 && array[i]>key){
                array[i+1]=array[i];
                i=i-1;
            }
            array[i+1]=key;
        }
        return array;
    }
}
