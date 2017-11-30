package com.company;

/**
 * Bicycle Class is example class learning for classes and objects
 * it has its own field and methods , Each class has its own characteristics and actions that it can perform
 * properties and behaviours
 */
public class Bicycle {
    //Fields
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    //Methods & actions that can perform
    public int changeCadence(int newCadence) {
        cadence = newCadence;
        return cadence;
    }

    public int changeGear(int newGearVal) {
        gear = newGearVal;
        return gear;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

}
