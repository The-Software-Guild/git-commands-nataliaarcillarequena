package com.sg.foundations.random;

import java.util.Random;

public class ALittleChaos {

    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));

        //displays a random number between 50 and 100
        System.out.println(randomizer.nextInt(51) + 50);

        //can include random numbers in a maths statement; adding random number (from 0 to 99) to random number (from 0 to 50)
        System.out.println(randomizer.nextInt(100) + randomizer.nextInt(50));

        //experimenting with different number types; outputs between 0 and 1
        System.out.println(randomizer.nextDouble());
        System.out.println(randomizer.nextFloat());
        //next gaussian generates random number from a range of normally distributed values with mean 0 and standard deviation 1
        System.out.println(randomizer.nextGaussian());

    }

}
