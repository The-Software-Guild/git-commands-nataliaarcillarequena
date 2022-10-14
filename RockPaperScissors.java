/** Natalia Arcilla Requena
 * date: 13/10/2022
 * purpose: ASSESSMENT- Rock Paper Scissors
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){

        //calling the method to play the game
        playAndPlayAgain();

    }

    //method for playing the whole game, and then playing it again if the user wishes to
    public static void playAndPlayAgain(){

        //declaring and initialising variables
        String userInput;
        String userInput2;
        String result;

        int ties = 0;
        int userWins = 0;
        int computerWins = 0;
        int gameRounds;
        int i; //to keep track of which round we are on in the for loop below

        //initialising the scanner
        Scanner myScanner = new Scanner(System.in);

        //prompting user input and scanning the users input
        System.out.println("How many round of Rock Paper Scissors would you like to play? Please pick between 1 and 10:");
        userInput = myScanner.nextLine();
        gameRounds = Integer.parseInt(userInput);

        //conditional for the number of rounds that the user has inputted
        if (gameRounds > 10 || gameRounds < 1){   //out of bounds
            System.out.println("Number of rounds submitted is out of range, game is being quit");
        } else {
            //the rounds are being played
            for (i = 1; i<=gameRounds; i++) {

                result = playingTheGame();   //calls the method which plays a round of the game, returns the result
                System.out.println(result);  //result of a round is displayed

                //keeping track of the results
                if (result.equals("Tie")){
                    ties = ties + 1;
                } else if (result.equals("user wins")) {
                    userWins = userWins + 1;
                }else {
                    computerWins = computerWins + 1;
                }
            }

            //displaying the final results
            System.out.println("The final results are: computer wins: " + computerWins + ", ties: " + ties + ", user wins: " + userWins);

            //declaring the overall winner
            if (userWins > computerWins){
                System.out.println("You win!");
            } else if (computerWins == userWins) {
                System.out.println("You have tied!");
            } else {
                System.out.println("The computer wins, better luck next time");
            }

            //user prompt for another game
            System.out.println("Would you like to play again? Please type yes or no");
            userInput2 = myScanner.nextLine();

            if (userInput2.equals("yes")){
                playAndPlayAgain();  //plays the game again from the start
            }else {
                System.out.println("Thanks for playing!");  //finishes the game
            }

        }

    }

    //method for rounds of the game, returning the result of each game
    public static String playingTheGame(){
        String usersChoice;
        String computersChoice;
        String gameResult = "";

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose your choice: Rock, Paper or Scissors?");
        usersChoice = myScanner.nextLine();

        //setting up computers random choice of rock, paper and scissors
        Random random = new Random();
        String [] game = new String[]{"Rock", "Paper", "Scissors"};

        //selecting a random index in the array of choices for the game
        int randomIndex = random.nextInt(game.length);
        computersChoice = game[randomIndex];  //gets the computers random choice from rock,paper,scissors

        //conditional for the results of the game and displaying the result
        if (usersChoice.equals(computersChoice)){  //used for equivalent results
            gameResult = "Tie";
        } else if (usersChoice.equals("Paper") && computersChoice.equals("Rock")) {
            gameResult = "user wins";
        } else if (usersChoice.equals("Scissors") && computersChoice.equals("Paper")) {
            gameResult = "user wins";
        } else if (usersChoice.equals("Rock") && computersChoice.equals("Scissors")) {
            gameResult = "user wins";
        } else {
            gameResult = "computer wins";
        }

        //return the result of the game
        return gameResult;
    }

}
