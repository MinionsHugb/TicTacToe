package is.ru.tictactoe;

public class tictactoe {

	public static int ROWS = 3;
	public static int COLS = 3;
	public static int[][] Board = new int[ROWS][COLS];

	public static void main(String args []){
		PrintBoard();
	}

	public static void PrintBoard()
	{
		System.out.print("------------- \n");
		for (int rows = 0; rows < ROWS; rows++)
		{
			System.out.print("| ");
			for (int cols = 0; cols < COLS; cols++)
			{
				System.out.print(Board[rows][cols]);
				System.out.print(" | ");
			}
			System.out.print("\n");
		}
		System.out.print("------------- \n");
	}

	public static int number(int a) {
		
		return a;
	}

	public static String layout () {
		
		return "a";
	}
}


