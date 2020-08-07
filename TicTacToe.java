import java.util.Scanner;

public class TicTacToe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] gameBoard;	// Variable for creating a 2D array game board	
		gameBoard = new String [3][3];	// 2D array for a 3x3 game board
		String player;
		String player1 = "";
		String player2 = "";
		String display;	// Variable for the board to display
		int colChoose;	// Variable to store the column entered by both players
		int rowChoose;	// Variable to store the row entered by both players
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to TicTacToe!! ");
		System.out.println("Instructions: The game of TicTacToe is a two player game, X and O, you and your partner will take turns marking the spaces in "); 
		System.out.println("a 3x3 grid. The player who succeeds in placing three of their tokens in a horizonal, vertical or diagonal row wins the game.");

		System.out.print("Press the key 'A' to start the game!");
		player = input.nextLine();
		if (player.equalsIgnoreCase("A"))
		{
			System.out.print(" ");
		}

		// 2D array to hold the game coordinates
		gameBoard [0][0] = "_";
		gameBoard [0][1] = "_";
		gameBoard [0][2] = "_";
		gameBoard [1][0] = "_";
		gameBoard [1][1] = "_";
		gameBoard [1][2] = "_";
		gameBoard [2][0] = "_";
		gameBoard [2][1] = "_";
		gameBoard [2][2] = "_";

		// Creating the game board
		System.out.println(" ");
		System.out.println("  1   2   3 ");
		System.out.println("1 " + gameBoard [0][0] + " | " + gameBoard [0][1] + " | " + gameBoard [0][2]);
		System.out.println(" ---|---|---");
		System.out.println("2 " + gameBoard [1][0] + " | " + gameBoard [1][1] + " | " + gameBoard [1][2]);
		System.out.println(" ---|---|---");
		System.out.println("3 " + gameBoard [2][0] + " | " + gameBoard [2][1] + " | " + gameBoard [2][2]);

		// Prompt the user to choose their token
		System.out.print("Choose your token--X or O: ");
		player = input.nextLine();
		System.out.println(" ");

		// Player can either choose to be 'X' or 'O'
		if (player.equalsIgnoreCase("X"))
		{
			player1 = player.toUpperCase();	
			player2 = "O";
			System.out.println("You are player 1--> " + player1);
			System.out.println("And your partner is player 2--> " + player2);
		}
		else if (player.equalsIgnoreCase("O"))
		{
			player1 = player.toUpperCase();
			player2 = "X";
			System.out.println("You are player 1--> " + player1);
			System.out.println("And your partner is player 2--> " + player2);
		}

		// for loop to prompt the user to enter row and column, to display the board and to check until there are three same tokens in a row
		for (int i = 1; i <=9; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 )	// Player 1 always has a odd turn (1,3,5,7,9) and player 2 always has a even turn (2,4,6,8)	
			{
				System.out.println(" ");
				System.out.println("Player 1's turn!");	// Indicate the user to who's turn it is to enter
			}
			else
			{
				System.out.println(" ");
				System.out.println("Player 2's turn!");	// Indicate the user to who's turn it is to enter
			}

			// Prompt the user to enter a row and column
			System.out.println(" ");
			System.out.print("Enter in a row (1-3): ");
			rowChoose = input.nextInt();
			System.out.print("Enter in a coloumn (1-3): ");
			colChoose = input.nextInt();

			if ((rowChoose <=3 && rowChoose > 0) && (colChoose <=3 && colChoose > 0))	// rowChoose and colChoose inputs have to be greater than zero and less than or equal to three
			{
				if (gameBoard[rowChoose-1] [colChoose-1] == "_")
				{	
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 )	// Player 1 always has a odd turn(1,3,5,7,9) and player 2 always has a even turn(2,4,6,8)
					{
						gameBoard[rowChoose-1][colChoose-1] = (player1);	// Stores Player 1's chosen token
					}
					else
					{
						gameBoard[rowChoose-1][colChoose-1] = (player2);	// Stores Player 2's chosen token
					}
				}
				else
				{
					System.out.println(" ");
					System.out.print("Sorry, already chosen, please play your turn\n");
					i--;	// Subtracts one from the value contained in the variable i 
				}

				display = gameBoard[rowChoose-1][colChoose-1];
				display = gameBoard[rowChoose-1][colChoose-1].replace(display, player);	// Replace the under score with the Player's token

				System.out.println("  1   2   3 ");
				System.out.println("1 " + gameBoard [0][0] + " | " + gameBoard [0][1] + " | " + gameBoard [0][2]);
				System.out.println(" ---|---|---");
				System.out.println("2 " + gameBoard [1][0] + " | " + gameBoard [1][1] + " | " + gameBoard [1][2]);
				System.out.println(" ---|---|---");
				System.out.println("3 " + gameBoard [2][0] + " | " + gameBoard [2][1] + " | " + gameBoard [2][2]);


				// Check to see if there are three same tokens placed in a row to be considered as a winner
				if ((gameBoard[0][0] == player1 && gameBoard[0][1] == player1 && gameBoard[0][2] == player1) || (gameBoard[1][0] == player1 && gameBoard[1][1] == player1 && gameBoard[1][2] == player1) || (gameBoard[2][0] == player1 && gameBoard[2][1] == player1 && gameBoard[2][2] == player1))
				{
					System.out.println("Player 1 WINS!");
					break;
				}
				else if ((gameBoard[0][0] == player2 && gameBoard[0][1] == player2 && gameBoard[0][2] == player2) || (gameBoard[1][0] == player2 && gameBoard[1][1] == player2 && gameBoard[1][2] == player2) || (gameBoard[2][0] == player2 && gameBoard[2][1] == player2 && gameBoard[2][2] == player2))
				{
					System.out.println("Player 2 WINS!");
					break;
				}	
				if ((gameBoard[0][0] == player1 && gameBoard [1][0] == player1 && gameBoard [2][0] == player1) || (gameBoard[0][1] == player1 && gameBoard[1][1] == player1 && gameBoard[2][1] == player1) || (gameBoard[0][2] == player1 && gameBoard[1][2] == player1 && gameBoard[2][2] == player1))
				{
					System.out.println("Player 1 WINS!");
					break;
				}
				else if ((gameBoard[0][0] == player2 && gameBoard [1][0] == player2 && gameBoard [2][0] == player2) || (gameBoard[0][1] == player2 && gameBoard[1][1] == player2 && gameBoard[2][1] == player2) || (gameBoard[0][2] == player2 && gameBoard[1][2] == player2 && gameBoard[2][2] == player2))
				{
					System.out.println("Player 2 WINS!");
					break;
				}
				if ((gameBoard[0][0] == player1 && gameBoard [1][1] == player1 && gameBoard [2][2] == player1) || (gameBoard[0][2] == player1 && gameBoard[1][1] == player1 && gameBoard[2][0] == player1))
				{
					System.out.print("Player 1 WINS!");
					break;
				}
				else if ((gameBoard[0][0] == player2 && gameBoard [1][1] == player2 && gameBoard [2][2] == player2) || (gameBoard[0][2] == player2 && gameBoard[1][1] == player2 && gameBoard[2][0] == player2))
				{
					System.out.print("Player 2 WINS!");
					break;
				}
				else if (i == 9 )	// If player 1 fills the last(9th) box in the game then 'It's a DRAW!'
				{
					System.out.print("It's a DRAW!");	
				}
			}
			else 
			{
				System.out.println(" ");
				System.out.print("Invalid Move!");	// Displays 'Invalid Move' if rowChoose and colChoose is greater than three or if it is below zero
				i--;	// Subtracts one from the value contained in the variable i
			}

		}
		input.close();

	}

}
