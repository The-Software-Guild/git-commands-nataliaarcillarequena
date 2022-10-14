package com.sg.foundations.random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

        public static void main(String[] args){
            //declare vars

            String userNumber;
            int chosenNumber;

            //random initialiser
            Random randomiser = new Random();

            //initialise scanner
            Scanner myScanner = new Scanner(System.in);

            //display the prompt + users number
            System.out.println("Ive chosen a number between -100 and 100. Bet you can't guess it!");

            //display- get users input
            System.out.println("please pick an integer");
            userNumber = myScanner.nextLine();
            chosenNumber = Integer.parseInt(userNumber);

            //computers choice random between -100 and 100
            int numberChoice = randomiser.nextInt(201) - 100;
            System.out.println("chosen number is: " + chosenNumber);

            if (chosenNumber == numberChoice){
                System.out.println("Wow, nice guess! That was it!");
            } else if (chosenNumber < numberChoice) {
                System.out.println("Ha, nice try- too low! Try picking again: ");

                userNumber = myScanner.nextLine();
                chosenNumber = Integer.parseInt(userNumber);

                System.out.println("chosen number is: " + chosenNumber);
                
                if (chosenNumber == numberChoice){
                    System.out.println("Wow, nice guess! That was it!");
                } else if (chosenNumber < numberChoice) {
                    System.out.println("Ha, nice try- too low! I chose " + numberChoice);
                } else {
                    System.out.println("Too bad, way too high. I chose " + numberChoice);
                }
            } else {
                System.out.println("Too bad, way too high. Try picking again: ");

                userNumber = myScanner.nextLine();
                chosenNumber = Integer.parseInt(userNumber);

                System.out.println("chosen number is: " + chosenNumber);

                if (chosenNumber == numberChoice){
                    System.out.println("Wow, nice guess! That was it!");
                } else if (chosenNumber < numberChoice) {
                    System.out.println("Ha, nice try- too low! I chose " + numberChoice);
                } else {
                    System.out.println("Too bad, way too high. I chose " + numberChoice);
                }

            }

        }

}