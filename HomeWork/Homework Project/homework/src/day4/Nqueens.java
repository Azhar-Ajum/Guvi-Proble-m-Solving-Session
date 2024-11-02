package day4;

//Question : Implement the N-Queens problem using baicktracking
//Matrix Problem


import java.util.Scanner;

public class Nqueens {
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();

		int[][] board = new int[n][n];

		if (nqueenssolve(board, 0, n)) {
			
			display(board, n);
			
		} else {
			System.out.println("No solution found.");
		}

		s.close();
	}


	
	
	
	
	//solve nqueens problem
		private static boolean nqueenssolve(int[][] board, int column, int n) {
			if (column >= n) {
				return true; // All queens placed successfully
			}

			for (int i = 0; i < n; i++) {
				if (issafe(board, i, column, n)) {
					board[i][column] = 1; // Place queen
					
					
					//Recursive
				    if (nqueenssolve(board, column + 1, n)) {
						return true; // Solution found
					}

					board[i][column] = 0; // Backtrack
				}
			}

			return false; // No solution exist
		}
		
		
	
	

	//method to check queen can be placed on board[row][column]
	private static boolean issafe(int[][] board, int row, int column, int n) {
		
		// Check this row on the left side
		for (int i = 0; i < column; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}

		// Check upper diagonal on left side
		for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		// Check lower diagonal on left side
		for (int i = row, j = column; i < n && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		return true;
	}
	
	
	
	//Print Board Method
		private static void display(int[][] board, int N) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (board[i][j] == 1) {
						System.out.print("Q ");
					} else {
						System.out.print(". ");
					}
				}
				System.out.println();
			}
		}

}





