package com.company;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String dateAfter = scan.nextLine();
        String dateExpected = scan.nextLine();
        String[] dateActual = dateAfter.split(" ");
        String[] dateExpect = dateExpected.split(" ");

        // String arrayString[] = dateAfter.split(" ");
        int dA, mA, yA, dE, mE, yE;
        dA = Integer.parseInt(dateActual[0]);
        mA = Integer.parseInt(dateActual[1]);
        yA = Integer.parseInt(dateActual[2]);
        dE = Integer.parseInt(dateExpect[0]);
        mE = Integer.parseInt(dateExpect[1]);
        yE = Integer.parseInt(dateExpect[2]);
        int fine = 0;
        int daysA=dA + (mA*30)+(yA*365);
        int daysE=dE + (mE*30)+(yE*365);
        if(daysA > daysE){
            int diff = daysA - daysE;
            if(diff > 30){
                if (diff > 365){
                    fine =10000;
                }else {
                    fine = 500 * (mA - mE);
                }
            }else {
                if (yE == yA) {
                    if (mE == mA) {
                        if (dE < dA) {
                            fine = 15 * (dA - dE);
                        }
                    } else {
                        fine = 500 * (mA - mE);
                    }
                } else {
                    fine = 10000;
                }

            }
        }
        System.out.print(fine);
        /*if(dE < dA || mE < mA || yE < yA){
            dE = dE+30;
            mE = mE -1;
            if(mA > mE){
                mE = mE+12;
                yE = yE -1;
            }
        }

        if (yE >= yA) {
            if (mE >= mA) {
                if (dE < dA) {
                    fine = 15 * (dA - dE);
                }
            } else {
                fine = 500 * (mA - mE);
            }
        } else {
            fine = 10000;
        }*/


    }
}