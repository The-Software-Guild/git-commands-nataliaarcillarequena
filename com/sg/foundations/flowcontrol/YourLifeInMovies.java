package com.sg.foundations.flowcontrol;

import java.util.Scanner;

public class YourLifeInMovies {

    public static void main(String[] args){

        //declare vars
        String birthYear;
        int YoB;
        Scanner myScanner = new Scanner(System.in);

        //display question
        System.out.println("What is your year of birth?");
        birthYear = myScanner.nextLine();
        YoB = Integer.parseInt(birthYear);
        
        if (YoB < 2005){
            System.out.println("Up came out over a decade ago");
        }
        if (YoB < 1995) {
            System.out.println("First harry potter came out over 15 years ago");
        }
        if (YoB < 1985) {
            System.out.println("Space Jam came out not last decade but the decade before that!");
        }
        if (YoB < 1965) {
            System.out.println("MASH TV has been around for half a century");
        }


    }

}
