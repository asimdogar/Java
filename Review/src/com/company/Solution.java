package com.company;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int j=0;j<=testCases;j++) {
            String input = scanner.nextLine();
            char[] inputArray = input.toCharArray();
            String evenString = "";
            String oddString = "";
            if (input.length() >= 2 && input.length() <= 10000) {
                for (int i = 0; i < input.length() ; i++) {
                    if (i % 2 == 1) {
                        oddString += inputArray[i];
                    } else {
                        evenString += inputArray[i];
                    }
                }
                System.out.println(evenString + " " + oddString);
            }
        }
    }

}
