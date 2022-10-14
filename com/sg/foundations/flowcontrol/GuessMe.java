package com.sg.foundations.flowcontrol;
import java.util.Scanner;


public class GuessMe {

    public static void main(String[] args){
        //declare vars
        int numberChoice = 5;
        String userNumber;
        int chosenNumber;

        //initialise scanner
        Scanner myScanner = new Scanner(System.in);

        //display- get users input
        System.out.println("please pick an integer");
        userNumber = myScanner.nextLine();

        chosenNumber = Integer.parseInt(userNumber);

        //display the users number
        System.out.println("chosen number is: "+ chosenNumber);

        if (chosenNumber == numberChoice){
            System.out.println("Wow, nice guess! That was it!");
        } else if (chosenNumber < numberChoice) {
            System.out.println("Ha, nice try- too low! I chose " + numberChoice);
        } else {
            System.out.println("Too bad, way too high. I chose " + numberChoice);
        }


    }



}
