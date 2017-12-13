package com.company;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int j = 1; j <= T; j++) {
            int n = sc.nextInt();
            boolean isprime = true;
            if (n == 2) {
                isprime = true;
            } else if (n == 1 || (n & 1) == 0) {
                isprime = false;
            }

            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
            if (isprime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }

        }
    }
}