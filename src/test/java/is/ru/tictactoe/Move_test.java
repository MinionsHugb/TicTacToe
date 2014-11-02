package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;

public class Move_test {

        public static void main(String args []){
                org.junit.runner.JUnitCore.main("is.ru.tictactoe.Move_test");
        }

        @Test
        public  void insertMoveTest(){

                int[] arr = new int[9];
                for (int i = 0; i < 9; i++) {
                        arr[i] = 0;
                }

                int[] samplearr = arr;
                arr[4] = 1;

            assertEquals(arr, Move.insertMove(1, samplearr, 5));
        }
	
	@Test
	public void changeToCharTest(){
		int[] arr = new int[9];
        	for(int i = 0; i < 9; i++){
            		arr[i] = 0;
         	}
         	arr[7] = 1;
	
         	char[] c = new char[9];
         	for(int i = 0; i < 9; i++){
            		c[i] = ' ';
         	}
         	c[7] = 'X';

	    assertArrayEquals(c,Move.changeToChar(arr));
	}

	
//Tests if method allows move in full field
@Test
    public void validMoveTest1(){

		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = 0;
		}
		
		arr[5] = 1;

	    assertEquals(false, Move.validMove(6, arr));
	}

//Tests if method allows move other than 1-9	
@Test
    public void validMoveTest2(){

		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = 0;
		}

	    assertEquals(false, Move.validMove(11, arr));
	}
}
