package com.company;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public String listRandomMovie() throws Exception{

        File file= new File("Movies.txt");
        Scanner scanner = new Scanner(file);
        int numberOfLines=0;
        String [] movies =new String[100];

        while(scanner.hasNextLine()){
            movies[numberOfLines]=scanner.nextLine();
            numberOfLines++;
        }

        int randomIndex= (int)((Math.random()*numberOfLines)+1);
        return movies[randomIndex];
    }
    public void guessMovie()throws Exception{
        String movieName=listRandomMovie();
        char[] chars=new char[movieName.length()];
        Arrays.fill(chars, '_');
        String guessName = new String(chars);
       // System.out.println("Movie Name is : "+movieName+" Guess is : "+guessName);
        int guessCount=0;
        String wrongLetters="";

        String tempMovieName=movieName;

        while(guessCount<=10 || (movieName.equals(guessName))){

            System.out.println("You are guessing: "+guessName+"   "+movieName);
            System.out.println("You have guessed ("+guessCount+") wrong letters "+wrongLetters);
            Scanner scanner= new Scanner(System.in);
            String guess=scanner.nextLine();
            int index=tempMovieName.indexOf(guess);

            if((index==-1) && (wrongLetters.indexOf(guess)==-1)){
                wrongLetters=wrongLetters+guess+" ";
                guessCount++;
            }
            if (index>-1){
                tempMovieName=tempMovieName.replaceFirst(guess,"*");


            }
        }
        if(movieName.equals(guessName)){
            System.out.println("YOU WIN !!");
        }
        else if (guessCount>=10){
            System.out.println("YOU LOSE!!");
            System.out.println("Movie Name is : "+movieName);
        }

    }

}
