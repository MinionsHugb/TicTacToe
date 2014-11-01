package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Board_test {
        public static void main(String args[]) {
              org.junit.runner.JUnitCore.main("is.ru.tictactoe.board_test");
            }

                @Test
                public  void isFullEmptyBoardTest(){
                        int[] temp = new int[9];
                        for(int i = 0; i < 9; i++){
                                temp[i] = 0;
                        }
                        assertEquals(false, Board.isFull(temp));
                }

		@Test
                public  void isFullFullBoardTest(){
                        int[] temp = new int[9];
                        for(int i = 0; i < 9; i++){
                                temp[i] = 1;
                        }
                        assertEquals(true, Board.isFull(temp));
                }

		@Test
                public  void isFullNotEmptyNotFullTest(){
                        int[] temp = new int[9];
                        for(int i = 0; i < 9; i++){
                        	if(i % 2 == 0){
                        		temp[i] = 1;
                        	}
                        	else{
                        		temp[i] = 0;
                        	}
                        }
                        assertEquals(false, Board.isFull(temp));
                }
}
