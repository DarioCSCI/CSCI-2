import java.util.Scanner;

public class TicTacToe{
	public static void main(String[] args){
	//1. Make board
	char[][] board = new char [3][3];
	
	//2. Start Symbol @ X
	char symbol = 'X';
	Scanner kb = new Scanner(System.in);
	boolean again = true;

	do{
		//	Mark symbol on board
		System.out.print("Enter row (0-2)and column (0-2): ");
		int row = kb.nextInt();
		int col = kb.nextInt();
		
		board[row][col] = symbol;

		//	print board
			for(int i = 0; i < board.length; i++){
				for(int j = 0; j < board[0].length; j++){
					System.out.print(board[i][j] + "  | ");
				}
				System.out.println("\n--------------");
			}

			//3 check for winner or draw by calling same 
			//method from below
			if(!hasWinner(board, symbol)){
				if(isFull(board)){
					System.out.println("It's a draw!");
					again = false;
				}
			}
			else{
				System.out.println(symbol + " wins!");
				again = false;
			}
			//4. switch players and start over
			if(symbol == 'X'){
				symbol = 'O';
			}
			else{
				symbol = 'X';
			}
		}while(again);
		System.out.println("GAME OVER.");
	}


	//3.check for winner or draw
	public static boolean hasWinner(char[][] board, char symbol){
	//3a. check rows
		for(int i = 0; i < board.length; i++){
			if(checkRow(board, symbol, i)){
				return true;
			}
		}
		
		//check columns
		for(int i = 0; i < board[0].length; i++){
			if(checkRow(board, symbol, i)){
				return true;
			}
		}
		
		//check left diag
		if(checkLeftDiag(board, symbol)){
			return true; 
		}
		
		//check right diag
		if(checkRightDiag(board, symbol)){
			return true;
		}
		return false;
	}
	//3a. check rows 
	public static boolean checkRow(char[][] board, char symbol, int rowNum){
		for(int i = 0; i < board[0].length; i++){
			if (board[rowNum] [i] != symbol){
				return false;
			}
		}
		return true;
	}
	
	//3b. check columns
	public static boolean checkColumn(char[][] board, char symbol, int columnNum){
		for (int i = 0; i < board[0].length; i++){
			if (board[i][columnNum] != symbol){
				return false;
			}
		}
		return true; 
	}
	//3c. check left diagonal
	public static boolean checkLeftDiag(char[][] board, char symbol){
		for(int i = 0; i < board.length; i++){
			if(board[i][i] != symbol){
				return false;
			}
		}
		return true;
	}
	
	//3d. check right diagonal
	public static boolean checkRightDiag(char[][] board, char symbol){
		for(int i = 0; i < board.length; i++){
			if(board[i][board.length - i - 1] != symbol){
				return false;
			}
		}
		return true;
	}
	//3e. check board full
	public static boolean isFull(char[][] board){
		for(int i =0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if(board[i][j] != 'X' && board[i][j]!= '0'){
					return false;
				}
			}
		}
		return true;
	}
}	