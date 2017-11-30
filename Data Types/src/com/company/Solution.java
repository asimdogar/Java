package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int i2;
        double d2 ;
        String s2=new String();

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2=scan.nextInt();
        /* Print the sum of both integer variables on a new line. */
        d2=scan. nextDouble();
        /* Print the sum of the double variables on a new line. */
        scan.nextLine();
        s2=scan.nextLine();
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        i2+=i;
        d2+=d;

        System.out.println(i2);
        System.out.println(d2);
        System.out.print(s+s2);
        scan.close();
    }
}