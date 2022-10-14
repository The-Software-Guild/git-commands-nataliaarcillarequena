package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {

    public static void main(String[] args){

        //declare var to keep track of number of executions in do while loop
        int i=1;

        //random initialised- for the likeliness of the kid to clean their room
        Random randomiser = new Random();

        //chance that the teenage will clean their room initialised by a random integer between 0 and 100
        int chance = randomiser.nextInt(101);

        do {
            System.out.println("Clean your room!! (x" + i + ")");
            chance = chance + 10;
            i = i + 1;

            if (i == 7){
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
        } while (chance < 100);

        if (i < 7 && chance>= 100){
            System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
        }
    }

}
