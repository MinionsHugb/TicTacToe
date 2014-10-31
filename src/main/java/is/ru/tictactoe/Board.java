package is.ru.tictactoe;

public class Board {
        private int[] fields;

        public Board(){
                 fields = new int[9];
        }

        /*public void insertFields(fields[]){
                for(int i = 0; i < 9; i++){
                        fields[i] = In in = System.console();
                }
        }*/

        public static boolean isFull(int[] fields){
                for(int i = 0; i < 9; i++){
                        if(i == 0){
                                return false;
                        }
                }
                return true;
        }
}

