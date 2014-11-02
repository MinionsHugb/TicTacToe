package is.ru.tictactoe;

import java.util.Scanner;

public class Move {

        public Move() { }

        //Method that takes in a player and array and
        //accepts an int that represents a move
        public static void insertMove(int p, int[] Fields) {
            Scanner sc = new Scanner(System.in);
            int f = sc.nextInt();
            insertMove(p, Fields, f);
        }

        //Method that inputs the move into the array
        public static int[] insertMove(int p, int[] Fields, int f) {
	boolean isValid = false;
		while(!isValid){
			if (validMove(f, Fields)) {
                		Fields[f-1] = p;
				isValid = true;
            		}

            		else{
                		System.out.println("Not a valid move");
				insertMove(p, Fields);
				isValid = true;
			}
		}
		return Fields;
        }

	//Method that tests if move is valid
   	public static boolean validMove(int f, int[] Fields) {
        	if( f > 9 || f < 1) {
           		return false;
       		}
       		if(Fields[f-1] != 0) {
            		return false;
       		}
       		else{
            		return true;
   	 	}	
	}
}
