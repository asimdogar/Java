package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main extends  Rocket{

    public static void main(String[] args) {
	// write your code here
        Simulation simulation = new Simulation();
        ArrayList<U1> rocketsU1 = new ArrayList<>();
        simulation.loadU1(simulation.loadItems());
        ArrayList<Rocket> rockets = new ArrayList<>();
        rockets.addAll(rocketsU1);
        System.out.println(simulation.runSimulation(rockets));

    }
}
