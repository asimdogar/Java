package com.company;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.print(Integer.parseInt(S));

        }catch (NumberFormatException e){
            System.out.print("Bad String");
        }
    }
}