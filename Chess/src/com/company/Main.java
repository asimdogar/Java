package com.company;

import java.util.*;

public class Main {

    int anInt;
    public static void main(String[] args) {

        Deque orders = new LinkedList();
        orders.addFirst("Order1");
        orders.addFirst("Order2");
        orders.addFirst("Order3");
        System.out.print(orders.poll());
        System.out.print(orders.poll());
        System.out.print(orders.poll());
        ArrayList grades = new ArrayList();
        List list= new ArrayList();
        System.out.println(grades.get(0));

    }
}
