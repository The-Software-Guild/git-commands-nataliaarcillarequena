package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {

    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 7;

        //while loop executes as long as time < bedtime, number of times executed is bedtime - timeNow
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes, if this was commented out, the loop would run forever - infinite number of times as timeNow < bedTime will always be satisfied
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }

}
