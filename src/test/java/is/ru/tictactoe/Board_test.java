package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Board_test {
        public static void main(String args[]) {
              org.junit.runner.JUnitCore.main("is.ru.tictactoe.board_test");
            }

                @Test
                public  void isFullEmptyBoardTest(){
                        int[] fields = new int[9];
                        for(int i = 0; i < 9; i++){
                                fields[i] = 0;
                        }
                        assertEquals(false, Board.isFull(fields));
                }

		@Test
                public  void isFullFullBoardTest(){
                        int[] fields = new int[9];
                        for(int i = 0; i < 9; i++){
                                fields[i] = 1;
                        }
                        assertEquals(false, Board.isFull(fields));
                }
}
