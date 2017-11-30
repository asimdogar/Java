package com.company;

public class U1 extends Rocket {
    int currentWeight;
    int cargoCarried;
    int cargoLimit;

    public U1() {
        cost = 100;
        weight = 9071;  // 10 ton to kg
        maxWeight = 16329;  // 18 ton to kg
        currentWeight = weight;
        cargoCarried = currentWeight - weight;
        cargoLimit = maxWeight - weight;
        launchExplosion = (int) 0.05 * (cargoCarried / cargoLimit);
        landingCrash = (int) 0.01 * (cargoCarried / cargoLimit);
    }

    @Override
    public boolean launch() {
        if(launchExplosion >= 100) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean land() {
        if(landingCrash >= 100) {
            return false;
        } else {
            return true;
        }
    }
}