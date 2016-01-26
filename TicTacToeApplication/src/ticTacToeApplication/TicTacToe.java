package ticTacToeApplication;

public class TicTacToe {

	/*******************************/
	/* Picture of Game with Index: */
	/* FOR STORAGE:............... */
	/* 0 | 1 | 2 ................. */
	/* ---------- ................ */
	/* 3 | 4 | 5 ................. */
	/* ---------- ................ */
	/* 6 | 7 | 8 ................. */
	/* WHAT THE USER THINKS: ..... */
	/* 1 | 2 | 3 ................. */
	/* ---------- ................ */
	/* 4 | 5 | 6 ................. */
	/* ---------- ................ */
	/* 7 | 8 | 9 ................. */
	/*******************************/
	/* UI Picture of Game: ....... */
	/* INIT: ..................... */
	/* | - | - | - | ............. */
	/* ------------- ............. */
	/* | - | - | - | ............. */
	/* ------------- ............. */
	/* | - | - | - | ............. */
	/* GAMEPLAY: ................. */
	/* | 0 | - | 0 | ............. */
	/* ------------- ............. */
	/* | - | X | - | ............. */
	/* ------------- ............. */
	/* | - | - | X | ............. */

	/* Declare a board, containing X's and O's */
	protected char[] board;
	/* Define the markers for the two players */
	protected char userMarker;
	protected char aiMarker;
	/* Declare a winner */
	protected char winner;
	/* Keep track of who's turn it is */
	protected char currentMarker;

	/* Constructor for the TicTacToe class */
	public TicTacToe(char userMarkerIn, char aiMarkerIn) {
		/* Initialize the markers, and set the winner to undetermined '-' */
		this.userMarker = userMarkerIn;
		this.aiMarker = aiMarkerIn;
		this.winner = '-';
		this.board = setBoard();
	}

	/* Create and initialize a board */
	public static char[] setBoard() {
		/* Create the board */
		char[] board = new char[9];
		/* Initialize the board with '-' for not played spaces */
		for (int i = 0; i < board.length; i++) {
			board[i] = '-';
		}

		/* Return the new board */
		return board;
	}

	/*
	 * Play a turn in spot, return true if it worked ok, or false if there was a
	 * problem
	 */
	public boolean playTurn(int spot) {
		/* Is the spot valid? */
		boolean isValid = withinRange(spot) && !isSpotTaken(spot);
		/* If it is a valid spot, then make the move */
		if (isValid) {
			/* Mark the spot on the board, with the current Marker */
			board[spot - 1] = currentMarker;
			/* It is the other persons turn */
			currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
		}
		/* Return status of playing the turn */
		return isValid;
	}

	/* Check if our spot is in range */
	public boolean withinRange(int spot) {
		/* Return true if this is a valid spot */
		return 0 < spot && spot < board.length + 1;
	}

	/*
	 * Is the spot on the board taken, return true if taken, false if available
	 */
	public boolean isSpotTaken(int spot) {
		/* Return true if the spot is taken, false if it is available */
		return board[spot - 1] != '-';
	}

	/* Print out the board */
	/* Try to create: */
	/* | - | - | - | */
	/* ------------- */
	/* | - | - | - | */
	/* ------------- */
	/* | - | - | - | */
	public void printBoard() {
		System.out.println();
		/* Loop thru the spots on the board */
		for (int i = 0; i < board.length; i++) {
			/* See if we are at a break in the line */
			if (i % 3 == 0 && i != 0) {
				System.out.println("|");
				System.out.println("-------------");
			}
			/* Print the next spot on the board */
			System.out.print(" | " + board[i]);
		}
		/* Print a newline at the end */
		System.out.println();
	}
	
	/* Print out the numbers marking each possible spot for the player to play */
	public void printIndexBoard() {
		System.out.println();
		/* Loop thru the spots on the board */
		for (int i = 0; i < board.length; i++) {
			/* See if we are at a break in the line */
			if (i % 3 == 0 && i != 0) {
				System.out.println("|");
				System.out.println("-------------");
			}
			/* Print the number for the next spot on the board */
			System.out.print(" | " + (i+1));
		}
		/* Print a newline at the end */
		System.out.println();
	}
	
	/* See if there is a winner */
	public boolean isThereAWinner() {
		boolean diagonalsAndMiddles = rightDiagonal() ||
									  leftDiagonal() ||
									  middleRow() ||
									  secondColumn() &&
									  board[4] != '-';
		boolean topAndFirst = topRow() || firstCol() && board[0] != '-';
		boolean bottomAndThird = bottomRow() || thirdRow() && board[8] != '-';
		if (diagonalsAndMiddles) {
			this.winner = board[4];
		} else if (topAndFirst) {
			this.winner = board[0];
		} else if (bottomAndThird) {
			this.winner = board[8];
		}
		return diagonalsAndMiddles;
	}

	private boolean rightDiagonal() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean leftDiagonal() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean middleRow() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean secondColumn() {
		// TODO Auto-generated method stub
		return false;
	}

}
