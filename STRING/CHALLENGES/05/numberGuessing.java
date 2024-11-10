import java.util.Random;
import java.util.Scanner;

public class numberGuessing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    int numberToGuess = random.nextInt(100) + 1;// Random number between 1 and 100

    int attempts = 0;
    int guess = 0;

    System.out.println("Welcome to the Number Guessing Game!");

    System.out.println("I'm thinking of a number between 1 and 100.");

    System.out.println("Try to guess it!");

    // Loop until the user guesses correctly

    while (guess != numberToGuess) {

      System.out.println("Enter your guess: ");
      // Check if input is a valid integer

      if (scanner.hasNextInt()) {
        guess = scanner.nextInt();

        attempts++;

        if (guess < numberToGuess) {
          System.out.println("Too low! Try again." + " in " + attempts + " Attempts");
        } else if (guess > numberToGuess) {
          System.out.println("Too high! Try again." + " in " + attempts + " Attempts");
        } else {
          System.out.println("Congratulations! You've guessed the number" + " in " + attempts + " Attempts");
        }
      } else {
        System.out.println("Please enter a valid number.");
        scanner.next();
      }

    }
    scanner.close();
  }

}
