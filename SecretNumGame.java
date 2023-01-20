package csci2010.secretnumgame;
//CSCI 2010 was the class I was currently in at the time that I made them
//While we were asked to create this as a class activity, this code is my property and my property only 

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Jack Rawls Freshman Computer Science Student at Austin Peay State
 * University
 */
public class SecretNumGame {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int secretNum = 25;//maybe take this one out later
        int userGuess;
        int tries = 5;
        Random rand = new Random();
        int newRand = rand.nextInt(1, 20);
        System.out.println("Enter the secret number between 0 and 100. You have 5 tries. After every wrong try you will be deducted a try ");
        do {
            System.out.println("Enter the number.");
            userGuess = kb.nextInt();
            if (userGuess == newRand) {
                System.out.println("You guesses the secret number! Congratulations.");
                System.exit(0);
            } else if (userGuess < newRand || userGuess > newRand) {
                if (tries == 1) {
                    System.out.println("The secret number was " + newRand + "\nHave a great day!");
                    System.exit(0);
                }
                tries--;
                System.out.println("That is not the secret number. You now have " + tries + " left");
            }
        } while (tries <= 5);

    }
}
