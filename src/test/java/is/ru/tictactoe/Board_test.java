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

		@Test
                public void hasWonWin1(){
                	int[] temp = new int[9];
                	temp[0] = 1;
                	temp[1] = 1;
                	temp[2] = 1;
                	assertEquals(true, Board.hasWon(temp));
                }

		@Test
                public void hasWonWin2(){
                	int[] temp = new int[9];
                	temp[3] = 1;
                	temp[4] = 1;
                	temp[5] = 1;
                	assertEquals(true, Board.hasWon(temp));
                }

		@Test
                public void hasWonWin3(){
                	int[] temp = new int[9];
                	temp[6] = 2;
                	temp[7] = 2;
                	temp[8] = 2;
                	assertEquals(true, Board.hasWon(temp));
                }

		@Test
                public void hasWonWin4(){
                	int[] temp = new int[9];
                	temp[0] = 2;
                	temp[3] = 2;
                	temp[6] = 2;
                	assertEquals(true, Board.hasWon(temp));
                }

		@Test
                public void hasWonWin5(){
                	int[] temp = new int[9];
                	temp[1] = 1;
                	temp[4] = 1;
                	temp[7] = 1;
                	assertEquals(true, Board.hasWon(temp));
                }

		@Test
                public void hasWonWin6(){
                	int[] temp = new int[9];
                	temp[2] = 2;
                	temp[5] = 2;
                	temp[8] = 2;
                	assertEquals(true, Board.hasWon(temp));
                }

		@Test
                public void hasWonWin7(){
                	int[] temp = new int[9];
                	temp[0] = 1;
                	temp[4] = 1;
                	temp[8] = 1;
                	assertEquals(true, Board.hasWon(temp));
                }

		@Test
                public void hasWonWin8(){
                	int[] temp = new int[9];
                	temp[2] = 1;
                	temp[4] = 1;
                	temp[6] = 1;
                	assertEquals(true, Board.hasWon(temp));
                }

		@Test
                public void hasWonLose1(){
                	int[] temp = new int[9];
                	temp[0] = 1;
                	temp[1] = 0;
                	temp[2] = 1;
                	assertEquals(false, Board.hasWon(temp));
                }

		@Test
                public void hasWonLose2(){
                	int[] temp = new int[9];
                	temp[3] = 1;
                	temp[4] = 0;
                	temp[5] = 1;
                	assertEquals(false, Board.hasWon(temp));
                }

		@Test
                public void hasWonLose3(){
                	int[] temp = new int[9];
                	temp[6] = 1;
                	temp[7] = 1;
                	temp[8] = 2;
                	assertEquals(false, Board.hasWon(temp));
                }

		@Test
                public void hasWonLose4(){
                	int[] temp = new int[9];
                	temp[0] = 2;
                	temp[3] = 2;
                	temp[6] = 1;
                	assertEquals(false, Board.hasWon(temp));
                }

		@Test
                public void hasWonLose5(){
                	int[] temp = new int[9];
                	temp[1] = 2;
                	temp[4] = 1;
                	temp[7] = 1;
                	assertEquals(false, Board.hasWon(temp));
                }

		@Test
                public void hasWonLose6(){
                	int[] temp = new int[9];
                	temp[2] = 0;
                	temp[5] = 2;
                	temp[8] = 1;
                	assertEquals(false, Board.hasWon(temp));
                }

		@Test
                public void hasWonLose7(){
                	int[] temp = new int[9];
                	temp[0] = 1;
                	temp[4] = 2;
                	temp[8] = 0;
                	assertEquals(false, Board.hasWon(temp));
                }

		@Test
                public void hasWonLose8(){
                	int[] temp = new int[9];
                	temp[2] = 0;
                	temp[4] = 0;
                	temp[6] = 0;
                	assertEquals(false, Board.hasWon(temp));
                }

		@Test
                public void isTieIsFullAndHasNotWonTest(){
                	int[] temp = new int[9];
                	temp[0] = 2;
                	temp[1] = 1;
                	temp[2] = 2;
                	temp[3] = 2;
                	temp[4] = 1;
                	temp[5] = 1;
                	temp[6] = 1;
                	temp[7] = 2;
                	temp[8] = 1;
                	assertEquals(true, Board.isTie(temp));
                }

		@Test
                public void isTieIsFullAndHasWonTest(){
                	int[] temp = new int[9];
                	temp[0] = 1;
                	temp[1] = 1;
                	temp[2] = 2;
                	temp[3] = 2;
                	temp[4] = 1;
                	temp[5] = 2;
                	temp[6] = 1;
                	temp[7] = 2;
                	temp[8] = 1;
                	assertEquals(false, Board.isTie(temp));
                }

		@Test
                public void isTieIsNotFullAndHasNotWonTest(){
                	int[] temp = new int[9];
                	temp[0] = 1;
                	temp[1] = 2;
                	temp[2] = 0;
                	temp[3] = 0;
                	temp[4] = 1;
                	temp[5] = 2;
                	temp[6] = 0;
                	temp[7] = 0;
                	temp[8] = 0;
                	assertEquals(false, Board.isTie(temp));
                }

		@Test
                public void isTieIsNotFullAndHasWonTest(){
                	int[] temp = new int[9];
                	temp[0] = 1;
                	temp[1] = 2;
                	temp[2] = 0;
                	temp[3] = 0;
                	temp[4] = 1;
                	temp[5] = 2;
                	temp[6] = 0;
                	temp[7] = 0;
                	temp[8] = 1;
                	assertEquals(false, Board.isTie(temp));
                }
}
