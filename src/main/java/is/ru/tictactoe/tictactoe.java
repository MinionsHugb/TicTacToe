package is.ru.tictactoe;

import java.util.Scanner;
//Travis check
public class tictactoe {

       public static void main(String args []){
       Board b = new Board();

                Move m = new Move();
                boolean player1 = true;
		//A loop that runs until the board is full or someone has won.
		//In each iteration we print the board, call insertMove and change whos turn it is.
                while((!b.isFull(b.fields)) && (!b.hasWon(b.fields))){
                        b.PrintBoard(b.fields);
                        if(player1){
                                System.out.println("It's your turn Player 1!");
                                m.insertMove(1, b.fields);
                        }
                        else{
                                System.out.println("It's your turn Player 2!");
                                m.insertMove(2, b.fields);
                        }
                        if(player1){
                                player1 = false;
                        }
                        else{
                                player1 = true;
                        }

                }
		//Prints out the final board and reveals the result.
		b.PrintBoard(b.fields);
                if(b.isTie(b.fields)){
                        System.out.println("DRAW!");
                }
                else{
                        if(!player1){
                                System.out.println("VICTORY for Player 1");
                        }
                        else{
                                System.out.println("VICTORY for Player 2");
                        }
                }
        }
}

