// GuessingGame.java
// - Matthew Kunimoto
// This is a guessing game created in java for computer science tutoring purposes.
// The program generates a random number and asks the user to guess it. After incorrect guesses,
// the user is told whether they were high or low. After guessing correctly, the user is given
// the option of playing a new game with a new random number. When the user no longer wishes to
// play, overall game statistics are printed out.

import java.lang.*;
import java.util.*;

public class GuessingGame{
    // Class constants
    public static final int MAX_RAND = 100;    // maximum value for the randomly generated number

    public static void main(String[] args){
        // Greet players with a stupid haiku
        System.out.println();
        System.out.println("random number time");
        System.out.println();        
        System.out.println("     guess it right and you'll be fine");
        System.out.println();        
        System.out.println("          haiku need not rhyme");
        System.out.println();

        // Stat tracking:
        int totalGames = 0;		// total number of games played
        int totalGuess = 0;		// total number of guesses made
        int highscore = -1;		// least number of guesses needed to complete a game

        Scanner userInput = new Scanner(System.in);		// scanner to read user input
        boolean keepGoing = true;						// true as long as user wants to keep playing 

        // While loop that repeats for each game that is played
        while(keepGoing){
        	int numGuesses = newGame();
        	// Record stats:
        	totalGames++;
        	totalGuess += numGuesses;
        	if(highscore == -1 || numGuesses < highscore)
        		highscore = numGuesses;

        	// Ask user if they would like to keep playing
        	System.out.println();
        	System.out.print("Do you want to play again? ");
        	String response = userInput.next();
        	if(Character.toLowerCase(response.charAt(0)) != 'y'){
        		keepGoing = false;
        	}
  	       	System.out.println();
        }

        printStats(totalGames,totalGuess,highscore);
    }

    public static int newGame(){
    // Main method for running through a single game. Generates a random number and
    // has the user guess until they have guessed it correctly.
    // OUT: number of guesses made	

    	// create a random number from 1 to MAX_RAND
        Random rand = new Random();	
    	int number = rand.nextInt(MAX_RAND) + 1;
    	// System.out.printf("%d%n",number);				// useful for testing purposes

    	System.out.printf("I'm thinking of a number between 1 and %d... %n", MAX_RAND);

    	// Guessing time: loop until a correct guess is made
    	int numGuesses = 0;
    	boolean stillGuessing = true;
        Scanner userInput = new Scanner(System.in);		// scanner to read user input
    	while(stillGuessing){
    		// Ask for user's guess
    		System.out.print("Your  guess? ");
    		int guess = userInput.nextInt();

    		numGuesses++;	// increment number of guesses

    		// Three valid scenarios: too high, too low, and just right
    		if(guess > number)						// too high
    			System.out.println("It's lower.");

    		else if(guess < number)					// too low
    			System.out.println("It's higher");
    		
    		else{									// just right	
    			if(numGuesses == 1)
    				System.out.println("You got it right in 1 guess!");
    			else
    				System.out.printf("You got it right in %d guesses!", numGuesses);
    			
    			stillGuessing = false;
    		}

    		// Note: Could make correct guess another "else if" branch and make the "else"
    		//		 case be for reporting errors.
    	}
    	return numGuesses;
    }

    public static void printStats(int totalGames, int totalGuess, int highscore){
    // Displays the overal game statistics that were tracked
    // IN: total number of games, total number of guesses, highscore (least guesses until correct)
    
        float guessPerGame = (float) totalGuess/totalGames;
        System.out.println("Overall results:");
        System.out.printf("Total games   = %d %n", totalGames);
        System.out.printf("Total guesses = %d %n", totalGuess);
        System.out.printf("Guesses/game  = %.2f %n", guessPerGame);
        System.out.printf("Best game     = %d", highscore);
        System.out.println();
        System.out.println();

        // Note: %n denotes a line break in java
    }
}