package ticTacToeApplication;

import java.util.ArrayList;
import java.util.Random;

/* The computer, playing TicTacToe */
public class AI {

	/* pick a spot to play */
	public int pickSpot(TicTacToe game) {
		/* Available spots on the board */
		ArrayList<Integer> choices = new ArrayList<Integer>();
		
		/* Scan the board for available spots */
		for (int i=0; i<game.board.length; i++) {
			/* If the spot is not taken, add it to our list of available spots */
			if (game.board[i] == '-') {
				/* Store the available spot in the choices array */
				choices.add(i + 1);
			}
		}
		/* Pick a random spot amongst the available spots */
		Random rand = new Random();
		
		/* Return a randomly selected spot */
		return choices.get(Math.abs(rand.nextInt() % choices.size()));
		
	}
}
