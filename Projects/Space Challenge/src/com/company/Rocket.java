package com.company;

public class Rocket implements SpaceShip {

    int cost;
    int weight;
    int maxWeight;
    int launchExplosion;
    int landingCrash;

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {

        if((this.weight+item.weight) <= this.maxWeight){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void carry(Item item) {

        this.weight+=item.weight;
    }


}
