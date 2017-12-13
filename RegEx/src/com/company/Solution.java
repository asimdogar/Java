package com.company;

/**
 * Created by ASIM on 12/10/2017.
 */

import java.io.*;
import java.util.*;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        scan.nextLine();
        String readInput[] = new String[input];
        for (int i = 0; i < input; i++) {
            readInput[i] = scan.nextLine();
        }
        Arrays.sort(readInput);

        for (int i = 0; i < input; i++) {
            if (readInput[i].contains("@gmail.com")) {
                String firstName[] = readInput[i].split(" ");
                System.out.print(firstName[0]);
            }
        }
    }
}