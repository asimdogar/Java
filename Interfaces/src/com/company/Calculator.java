package com.company;

public class Calculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int divisor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisor += i;
            }
        }
        return divisor;
    }
}
