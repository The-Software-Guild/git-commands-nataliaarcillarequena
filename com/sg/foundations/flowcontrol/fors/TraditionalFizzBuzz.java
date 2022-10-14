package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {

    public static void main(String[] args){

        //asking user for a number, then converting to a number
        Scanner myScanner = new Scanner(System.in);
        System.out.print("How many units of fizzing and buzzing do you need in your life?");
        String userInput = myScanner.next();
        int usersNumber = Integer.parseInt(userInput);

        //counter for number of times fizz/buzz/fizzbuzz has popped up
        int countFizzBuzz =0;
        //initialising the incrementing numbers
        int numbers = 0;
        int fizzCount = 0;
        int buzzCount = 0;
        int fizzBuzzCount = 0;


       for (numbers = 0; countFizzBuzz < usersNumber; numbers++ ){

           if (numbers % 3 == 0 && numbers % 5 == 0 && numbers != 0){
               System.out.println("fizz buzz");
               fizzBuzzCount = fizzBuzzCount + 1;
               countFizzBuzz ++;

           } else if (numbers % 3 == 0 && numbers !=0){
               System.out.println("fizz");
               fizzCount = fizzCount + 1;
               countFizzBuzz++;

           } else if (numbers % 5 == 0 && numbers !=0) {
               System.out.println("buzz");
               buzzCount = buzzCount + 1;
               countFizzBuzz++;

           } else {
               System.out.println(numbers);
           }

       }
       System.out.println("TRADITION!!");

    }


}
