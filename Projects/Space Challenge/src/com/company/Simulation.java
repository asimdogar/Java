package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Simulation {
    public ArrayList<Item> loadItems(){

        ArrayList list = new ArrayList<Item>();

        File file = new File("phase-1.txt");
        //File file = new File("phase-2.txt");
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){

                String line = scanner.nextLine();
                String [] itemString =line.split("=");
                Item item= new Item();
                item.name=itemString[0];
                item.weight=Integer.parseInt(itemString[1]);
                list.add(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }

    public ArrayList<U1> loadU1(ArrayList<Item> items){
        ArrayList<U1> rockets = new ArrayList<U1>();
        Iterator itr = items.iterator(); // creating an iterator for allItems

        while (itr.hasNext()) {
            Item item = (Item) itr.next();
            System.out.println(item);
            U1 rocket = new U1();
            if(rocket.canCarry(item)){
                rocket.carry(item);
                rockets.add(rocket);
            }

        }
        return rockets;
    }
    public ArrayList<U2> loadU2(ArrayList<Item> items){
        ArrayList<U2> rockets = new ArrayList<U2>();
        Iterator itr = items.iterator(); // creating an iterator for allItems

        while (itr.hasNext()) {
            Item item = (Item) itr.next();
            System.out.println(item);
            U2 rocket = new U2();
            if(rocket.canCarry(item)){
                rocket.carry(item);
                rockets.add(rocket);
            }

        }
        return rockets;
    }

    public int runSimulation(ArrayList<Rocket> rocketArrayList){

        int budget=0;

        for (Rocket rocket : rocketArrayList){
           if(!rocket.launch() || !rocket.land()){
               rocket.launch();
               rocket.land();
               rocket.cost=rocket.cost*2;
           }
            budget += rocket.cost;
            Deque deque= new LinkedList();
            deque.

        }
        return budget;
    }
}
