package hangManApplication;

import java.io.IOException;
import java.util.Scanner;

public class HangManApplication {

	public static void main(String[] args) throws IOException {
		/* Instantiate a Scanner to read standard input */
		Scanner stdIn = new Scanner(System.in);

		/* Explain how to play the game */
		System.out.println("Welcome to hangman!  I will pick a word and you will try to guess it.\n"
				+ "If you guess wrong 6 times, then I win.  If you can guess it before then, you win.\n"
				+ "Are you ready?  I hope so, because I am");
		System.out.println();
		System.out.println("I have picked my word.  Below is a picture, and below \n"
				+ "that is your current guess, which starts off as nothing.  Every time you \n"
				+ "guess incorrectly.  I add a body part to the picture.  When there is a full \n"
				+ "person, you lose");
		/* Assume we want to continue playing */
		boolean doYouWantToPlay = true;
		
		/* Loop while you still want to play */
		while (doYouWantToPlay) {
			/* Setting up the game */
			System.out.println();
			System.out.println("Alright! Let's play!");
			/* Create a new hangman game */
			HangMan game = new HangMan();
			
			/* While the game isn't over, keep looping */
			do {
				/* Draw things */
				System.out.println();
				System.out.println(game.drawPicture());
				System.out.println();
				System.out.println(game.getFormalCurrentGuess());
				
				/* Get the guess */
				System.out.println("Enter a character that you think is in the word");
				char guess = (stdIn.next().toLowerCase()).charAt(0);
				System.out.println();
				
				/* See if the character is guessed already */
				while (game.isGuessedAlready(guess)) {
					System.out.println("Try again!  You've already guessed that character.");
					guess = (stdIn.next().toLowerCase()).charAt(0);
				}
				
				/* See if the character is in the word */
				if (game.playGuess(guess)) {
					System.out.println("Great Guess! That character is in the word!");
				} else {
					System.out.println("Unfortunately that character isn't in the word");
				}
				
			} while(!game.gameOver());
			
			System.out.println();
			/* Ask if you want to play another game */
			System.out.println("Do you want to play another game? Enter Y if you do.");
			Character response = (stdIn.next().toUpperCase()).charAt(0);
			/* Play again if the responded Y */
			doYouWantToPlay = (response == 'Y');
			
		}
		
	}

}
