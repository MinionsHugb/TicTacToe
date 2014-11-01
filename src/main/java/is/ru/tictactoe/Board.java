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
                        if(fields[i] == 0){
                                return false;
                        }
                }
                return true;
        }

	public static boolean hasWon(int[] fields){
        	if(fields[1] == fields[2] && fields[2] == fields[3]){
        		return true;
        	}
        	if(fields[4] == fields[5] && fields[5] == fields[6]){
        		return true;
        	}
        	if(fields[7] == fields[8] && fields[8] == fields[9]){
        		return true;
        	}
        	if(fields[1] == fields[4] && fields[4] == fields[7]){
        		return true;
        	}
        	if(fields[2] == fields[5] && fields[5] == fields[8]){
        		return true;
        	}
        	if(fields[3] == fields[6] && fields[6] == fields[9]){
        		return true;
        	}
        	if(fields[1] == fields[5] && fields[5] == fields[9]){
        		return true;
        	}
        	if(fields[3] == fields[5] && fields[5] == fields[7]){
        		return true;
        	}
        	return false;
        }
}

