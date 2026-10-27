import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = new Random().nextInt(100) + 1;
        int guess = 0;
        int attempts = 0; // Keeps track of how many tries you make

        System.out.println("Welcome to the Guessing Game!");

        // This loop repeats until your guess matches the secret number
        while (guess != secret) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();
            attempts++; // Adds 1 to your attempts counter every time you guess

            if (guess < secret) {
                System.out.println("Too low! Try again.");
            } else if (guess > secret) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("You got it!");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
    }
}