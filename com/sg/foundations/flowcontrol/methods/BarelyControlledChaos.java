package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {

        String color = aColor();

        String animal = anAnimal();

        String colorAgain = aColor();

        int weight = aNumber(5, 200);

        int distance = aNumber(10, 20);

        int number = aNumber(10000, 20000);

        int time = aNumber(2, 6);

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");


    }

    // ??? Method 1 ???
    // ??? Method 2 ???
    // ??? Method 3 ???

    //generating a random colour
    public static String aColor(){
        Random rng = new Random();
        String[] color = new String[] {"orange", "purple", "green",
                "red", "blue" };
        int randomIndex = rng.nextInt( color.length );

        String randomColor;
        randomColor = color[randomIndex];

        return randomColor;
    }

    //generating random animal
    public static String anAnimal(){
        Random rng = new Random();
        String[] animal = new String[]{"dog", "cat", "mouse",
                "rat", "pigeon", "racoon"};
        int randomIndex = rng.nextInt(animal.length);

        String randomAnimal;
        randomAnimal = animal[randomIndex];

        return randomAnimal;
    }

    //generating random integer chosen from range (min/max, inclusive)
    public static int aNumber(int min, int max){
        Random rng = new Random();

        int number = rng.nextInt(max + 1 - min) + min;
        //to make both upper and lower limits inclusive^

        return number;

    }

}
