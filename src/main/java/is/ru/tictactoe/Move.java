package is.ru.tictactoe;

import java.util.Scanner;

public class Move {

        public Move() {
                //
        }

        //Method that takes in a player and array and
        //accepts an int that represents a move
        public static void insertMove(int p, int[] Fields) {
            Scanner sc = new Scanner(System.in);
            int f = sc.nextInt();
            //sc.close();
            insertMove(p, Fields, f);
        }

        //Method that inputs the move into the array
        public static int[] insertMove(int p, int[] Fields, int f) {

            if (validMove(f, Fields)) {
                Fields[f-1] = p;
            }

            else
                System.out.println("Not a valid move");
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

	public static char[] changeToChar (int[] f) {
        char[] c = new char[9];
        for (int j = 0; j < 9; j++) {
            c[j] = ' ';
        }
        for (int i = 0; i < 9; i++)
        {
            if (f[i] == 1);
            {
                c[i] = 'X';
            }
            if (f[i] == 2)
            {
                c[i] = 'O';
            }
            if (f[i] == 0)
            {
                c[i] = ' ';
            }
        }
        return c;
    }
}
