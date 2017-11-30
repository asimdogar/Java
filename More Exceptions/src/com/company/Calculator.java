package com.company;

class Calculator {

    int power(int number, int power) throws Exception {
        if (power >= 0) {
            return (int) Math.pow(number, power);
        } else {
            throw new Exception("n and p should be non-negative");
        }
    }
}