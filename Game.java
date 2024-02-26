package java1;
import java.util.Scanner;


	import java.util.Scanner;
	import java.util.Random;

	public class Game {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int minRange = 1;
	        int maxRange = 100;
	        int attemptsLimit = 5;
	        int score = 0;
	        boolean playAgain = true;
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        
	        while (playAgain) {
	            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;
	            boolean guessedCorrectly = false;
	            
	            System.out.println("A random number between " + minRange + " and " + maxRange + " has been generated. You have " + attemptsLimit + " attempts to guess it.");
	            
	            while (!guessedCorrectly && attempts < attemptsLimit) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;
	                
	                if (userGuess == randomNumber) {
	                    System.out.println("Congratulations! You guessed the correct number.");
	                    guessedCorrectly = true;
	                    score += attemptsLimit - attempts + 1;
	                } else if (userGuess < randomNumber) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            }
	            
	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + randomNumber);
	            }
	            
	            System.out.println("Your current score: " + score);
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgainResponse = scanner.next();
	            playAgain = playAgainResponse.equalsIgnoreCase("yes");
	        }
	        
	        System.out.println("Thank you for playing! Your final score is: " + score);
	        scanner.close();
	    }
	}
