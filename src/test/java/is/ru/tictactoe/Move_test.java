package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
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
                arr[5] = 1;

            assertEquals(arr, Move.insertMove(1, samplearr, 5));
        }
}
