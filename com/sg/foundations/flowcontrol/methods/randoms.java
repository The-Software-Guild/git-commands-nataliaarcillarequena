package com.sg.foundations.flowcontrol.methods;

import java.util.Random;
//this doc is for testing the methods in the barelyControlledChaos file
public class randoms {
    public static void main(String[] args){
        Random rng = new Random();
        String[] color = new String[] { "orange", "purple", "green",
                "red", "blue" };
        int randomIndex = rng.nextInt( color.length );

        String randomColor;
        randomColor = color[randomIndex];

        System.out.println(randomColor);

        String myAnimal;
        myAnimal = anAnimal();
        System.out.println(myAnimal);

        int randomNumb;
        randomNumb = aNumber(1,7);
        System.out.println(randomNumb);

        String[] spaceCritters = { "tribble" , "bantha" , "star whale" , "tauntaun" , "babel fish" , "dewback" , "targ" , "toruk" , "porg" };
        int result = spaceCritters.length;
    }

    public static String anAnimal(){
        Random rng = new Random();
        String[] animal = new String[]{"dog", "cat", "mouse",
                "rat", "pigeon", "racoon"};
        int randomIndex = rng.nextInt(animal.length);

        String randomAnimal;
        randomAnimal = animal[randomIndex];

        return randomAnimal;
    }

    public static int aNumber(int min, int max){
        Random rng = new Random();

        int number = rng.nextInt(max + 1 - min) + min;
        //to make both upper and lower limits inclusive^

        return number;

    }


}
