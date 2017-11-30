package com.company;


public class MyBook extends Book {

    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;

    }

    @Override
    void display() {
        /*  Title: The Alchemist
            Author: Paulo Coelho
            Price: 248*/
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

