package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.tictactoe.board_test");
    }

	@Test
	public  void numberTest(){
		field[9] = (0,0,0,0,0,0,0,0,0);
		assertEquals(false, Board.field.isFull());
	}
}
