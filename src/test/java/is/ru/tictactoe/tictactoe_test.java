package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class tictactoe_test {

	public static void main(String args []){
		int x = 1;
		org.junit.runner.JUnitCore.main("is.ru.tictactoe.tictactoe_test");
	}

	@Test	
	public  void numberTest(){

		assertEquals(1, tictactoe.number(1));
	}

	@Test	
	public  void layoutTest(){

		assertEquals("a", tictactoe.layout());
	}

}
