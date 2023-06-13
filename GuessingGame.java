package guessinggame;

import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = (int)(Math.random() * (100) + 1);

        System.out.println("Guess a number between 1 and 100.");

        int guess = scan.nextInt();

        while (guess != num) {
            if (guess < num) {
                System.out.println("Guess is too low. Guess a new number.");
                guess = scan.nextInt();

            }
            else {
                System.out.println("Guess is too high. Guess a new number.");
                guess = scan.nextInt();
            }
        }

        System.out.println("Correct guess. The number was " + guess);

    }
}
