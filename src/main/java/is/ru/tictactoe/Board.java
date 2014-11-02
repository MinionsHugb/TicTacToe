package is.ru.tictactoe;


public class Board {
        public int[] fields;
	//Constructor initializing every element of the array to 0.
        public Board(){
                 fields = new int[9];
		 for(int i = 0; i < 9; i++){
			fields[i] = 0;
		 }
        }

    	//Prints the TicTacToe board.
	// Noting every 1 as an X, every 2 as an O and every 0 as number of the field.
	public static void PrintBoard(int[] f) {

	String XorO;
	System.out.print(" ------------- \n");
	for (int i = 0; i < 9; i++)
	{
		System.out.print(" | ");
		if (f[i] == 1)
		{
			XorO = "X";
			System.out.print(XorO);
		}
		else if (f[i] == 2)
		{
			XorO = "O";
			System.out.print(XorO);
		}
		else
		{
			System.out.print(i+1);
		}

		if (i == 2 || i == 5)
		{
			System.out.print(" |\n ------------- \n");
		}
	}
	System.out.print(" |\n -------------\n");
        }
	
	//If there aren't any empty space in the board it returns true and false otherwise.
        public static boolean isFull(int[] fields){
                for(int i = 0; i < 9; i++){
                        if(fields[i] == 0){
                                return false;
                        }
                }
                return true;
        }
	
	//Checks every winning combination and if the element in the fields are the same.
	public static boolean hasWon(int[] fields){
        	if(fields[0] == fields[1] && fields[1] == fields[2] && fields[1] != 0){
        		return true;
        	}
        	if(fields[3] == fields[4] && fields[4] == fields[5] && fields[4] != 0){
        		return true;
        	}
        	if(fields[6] == fields[7] && fields[7] == fields[8] && fields[7] != 0){
        		return true;
        	}
        	if(fields[0] == fields[3] && fields[3] == fields[6] && fields[3] != 0){
        		return true;
        	}
        	if(fields[1] == fields[4] && fields[4] == fields[7] && fields[4] != 0){
        		return true;
        	}
        	if(fields[2] == fields[5] && fields[5] == fields[8] && fields[5] != 0){
        		return true;
        	}
        	if(fields[0] == fields[4] && fields[4] == fields[8] && fields[4] != 0){
        		return true;
        	}
        	if(fields[2] == fields[4] && fields[4] == fields[6] && fields[4] != 0){
        		return true;
        	}
        	return false;
        }
	
	//If the board is full and nobody has won it returns true and false otherwise.
	public static boolean isTie(int[] fields){
        	if(isFull(fields) && !hasWon(fields)){
        		return true;
        	}
        	return false;
        }
}

