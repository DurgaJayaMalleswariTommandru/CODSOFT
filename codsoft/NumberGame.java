import java.util.*;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfAttempts = 0;
            int maxAttempts = 10;
            boolean hasGuessedCorrectly = false;
            System.out.println("Guess the number between 1 to 100. You have " + maxAttempts + " attempts.");
            while (numberOfAttempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                numberOfAttempts++;
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations Your guessed the correct number in " + numberOfAttempts + " attempts.");
                    hasGuessedCorrectly = true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry! You've used all " + maxAttempts + " attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play game again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing!");
    }
}
