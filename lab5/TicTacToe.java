package lab5;

public class TicTacToe {
	private static final char EMPTY = ' ';
	private char[][] board;

	public TicTacToe(char[][] boa) {
		this.board = boa;
	}

	// …
	/*
	 * This method checks all rows and returns true if any of them are marked with
	 * all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkRows() {
		boolean check = false;
		int check2 = -1;
		for (int i = 0; i < board.length; i++) {
			char f1 = board[i][0];
			if (f1 != EMPTY) {
				for (int j = 1; j < board[i].length; j++) {
					if (board[i][j] == f1)
						check = true;
					else {
						check = false;
					}
					f1 = board[i][j];
				}
			}
			if (check == true)
				check2++;
		}
		return check2 >= 0;
	}

	/*
	 * This method checks all columns and returns true if any of them are marked
	 * with all of a single player's. Otherwise, returns false.
	 */
	public boolean checkColumns() {
		boolean check = false;
		int check2 = -1;
		for (int i = 0; i < board.length; i++) {
			char f1 = board[0][i];
			if (f1 != EMPTY) {
				for (int j = 1; j < board[i].length; j++) {
					if (board[j][i] == f1)
						check = true;
					else {
						check = false;
					}
					f1 = board[j][i];
				}
			}
			if (check == true)
				check2++;
		}
		return check2 >= 0;
	}

	/*
	 * This method checks both diagonals and returns true if any of them are marked
	 * with all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkDiagonals() {
		// Check top-left to bottom-right
		// TODO
		// Check bottom-left to top-right
		// TODO
		boolean check = false;
		int check2 = -1;
		char f1 = board[0][0];
		if (f1 != EMPTY) {
			for (int i = 1; i < board.length; i++) {
				if (board[i][i] == f1)
					check = true;
				else {
					check = false;
				}
				f1 = board[i][i];
			}
		}
		if (check == true)
			check2++;
		char f2 = board[0][board[0].length - 1];
		check = false;
		if (f2 != EMPTY) {
			int j = board.length - 2;
			for (int i = 1; i < board.length; i++) {
				if (board[i][j] == f2)
					check = true;
				else {
					check = false;
				}
				f2 = board[i][j];
				j--;
			}
		}
		if (check == true)
			check2++;
		return check2 >= 0;
	}

	public static void main(String[] args) {
		char[][] board = { { 'X', 'X', 'X' }, 
						   { 'O', ' ', 'X' }, 
						   { 'O', 'O', 'X' } };
		TicTacToe tic = new TicTacToe(board);
		System.out.println(tic.checkRows());
		System.out.println(tic.checkColumns());
		System.out.println(tic.checkDiagonals());
	}
}
