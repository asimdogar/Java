package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ACMEBicycle bicycle = new ACMEBicycle();
        bicycle.changeCadence(10);
        bicycle.changeGear(1);
        bicycle.speedUp(10);
        bicycle.printStates();
    }
}
