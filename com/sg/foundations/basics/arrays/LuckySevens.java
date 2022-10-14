package com.sg.foundations.basics.arrays;
import java.util.Random;
import java.util.Scanner;

public class LuckySevens {

    public static void main(String[] args){

        //initialising the scanner
        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int dollars;
        int result;
        int dice1;
        int dice2;
        int totalRolls = 0;
        int new_dollars;
        int maxRolls =0;

        System.out.println("How many dollars do you have to bet?");
        userInput = myScanner.nextLine();
        dollars = Integer.parseInt(userInput);
        int maximum = dollars;

        while(dollars > 0){

            //adding 2 dice rolls and checking if their sum will make/loose money
            dice1 = diceRoll();
            dice2 = diceRoll();
            result = dice2 + dice1;
            totalRolls = totalRolls + 1; //keeping track of the number of rolls

            if (result == 7){
                new_dollars = dollars + 4; //player wins 4$
            } else {
                new_dollars = dollars - 1; //player looses 1$
            }

            if (new_dollars > dollars && maximum < new_dollars){
                maximum = new_dollars;  //keeping track of the max amount of dollars
                maxRolls = totalRolls;  //keeping track of the number of rolls when max dollars occurs
            }

            //the below statement was for testing
            //System.out.println(" dollars: "+ dollars + " die: " + result + " newDollars: " + new_dollars + " max dollars :" + maximum + " Total rolls: " + totalRolls);
            dollars = new_dollars; //carrying on from the dollars gained/lost

        }

        System.out.println("Youre broke after "  + totalRolls+ " rolls");
        System.out.println("You should have quit after " + maxRolls + " rolls when you had $" + maximum);

        //rolling the dice- getting a random number between 1 and 6

    }

    public static int diceRoll(){
        Random rng = new Random();

        int number = rng.nextInt(6) + 1;
        //generates random number between 1 and 6

        return number;

    }

}
