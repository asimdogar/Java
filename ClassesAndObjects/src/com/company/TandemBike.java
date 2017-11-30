package com.company;

public class TandemBike extends Bicycle {
    // new fields and methods defining
    // a mountain bike would go here
    int seats = 2;
    int handlebars = 2;

    public int getSeats() {
        return seats;
    }

    public int getHandlebars() {
        return handlebars;
    }

    @Override
    public String toString() {
        return "TandemBike{" +
                "seats=" + seats +
                ", handlebars=" + handlebars +
                '}';
    }
}
