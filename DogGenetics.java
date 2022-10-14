import java.util.Random;
import java.util.Scanner;

/** Natalia Arcilla Requena
 * date: 13/10/2022
 * purpose: ASSESSMENT- Dogs Genetics
 */

public class DogGenetics {

    public static void main(String[] args){

        //prompting user input
        System.out.print("What is your dog's name?");
        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.next();

        System.out.println("Well then, I have this highly reliable report on " + userInput + "'s prestigious background right here. \n");
        System.out.println(userInput + " is: \n");

        //generating 5 random doubles and putting them into an array
        double[] numbers = new double[5];

        Random random = new Random();
        //double randomValue = random.nextDouble();

        //populating array with random doubles between 0 & 1
        for (int i = 0; i < numbers.length; i++ ){
            numbers[i] = random.nextDouble();
        }

        //get the sum of all the numbers in the array
        double sum = 0;
        for (int i = 0; i < numbers.length; i++ ){
            sum = sum + numbers[i];
        }

        //divide each element in the array by the sum of all the elements and *100 to get all elements to add to 100, the percentages
        double[] percentages = new double[5];
        for (int i = 0; i < numbers.length; i++ ){
            percentages[i] = (numbers[i] / sum) * 100;
        }

        //dog names array
        String[] dogBreeds = new String[]{"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};

        for (int i = 0; i < percentages.length; i++ ){
            System.out.println(percentages[i] + "% " + dogBreeds[i]);
        }

        System.out.println("\nWow, that's QUITE the dog!");

    }

}
