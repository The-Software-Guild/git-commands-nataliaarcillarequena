import java.util.Scanner;

/** Natalia Arcilla Requena
 * date: 13/10/2022
 * purpose: ASSESSMENT - Healthy Hearts
 */

public class HealthyHearts {

    public static void main(String[] args){

        //prompt user input
        System.out.print("what is your age?");

        //initialise and use scanner
        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.next();
        int age = Integer.parseInt(userInput);

        //calc max heart rate and target heart rate zone
        double maxHeartRate = 220 - age;
        double target1 = (maxHeartRate / 100) * 50;  //calculating the percentage zone
        double target2 = (maxHeartRate / 100) * 85;

        //display messages
        System.out.println("Your maximum heart rate should be "+ maxHeartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + target1 + " - " + target2 + " beats per minute");

    }

}
