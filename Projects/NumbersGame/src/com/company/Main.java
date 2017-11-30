package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("I have choose numbers between [1 , 100]");
        System.out.println("Try to Guess");
        int guessNumber=(int)(Math.random()*100);
        guessNumber +=1;
        boolean findFlag=false;

        for (int i=10; i>0;i--){
            System.out.println("You have "+i+" guesses left");
            Scanner scanner = new Scanner(System.in);
            int number= scanner.nextInt();
            if (number > guessNumber){
                System.out.println("it is smaller than "+number);
            }else if (number < guessNumber){
                System.out.println("it is greater than "+number);
            }else {
                findFlag=true;
                break;
            }
        }
        if (findFlag){
            System.out.println("CORRECT !! YOU WIN");
        }else {
            System.out.println("GAME OVER !! YOU LOSE");
            System.out.println("The Number was : "+guessNumber);
        }
    }
}
