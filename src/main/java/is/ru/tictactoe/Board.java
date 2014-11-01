package is.ru.tictactoe;

public class Board {
        public int[] fields;

        public Board(){
                 fields = new int[9];
        }

        /*public void insertFields(fields[]){
                for(int i = 0; i < 9; i++){
                        fields[i] = In in = System.console();
                }
        }*/
	public static void PrintBoard(int[] f) {

        System.out.print("------------- \n");
        System.out.print("| " + f[0] + " | " + f[1] + " | " + f[2] + " |\n");
        System.out.print("------------- \n");
        System.out.print("| " + f[3] + " | " + f[4] + " | " + f[5] + " |\n");
        System.out.print("------------- \n");
        System.out.print("| " + f[6] + " | " + f[7] + " | " + f[8] + " |\n");
        System.out.print("------------- \n");

        }

        public static boolean isFull(int[] fields){
                for(int i = 0; i < 9; i++){
                        if(fields[i] == 0){
                                return false;
                        }
                }
                return true;
        }

	public static boolean hasWon(int[] fields){
        	if(fields[0] == fields[1] && fields[1] == fields[2] && fields[1] != 0){
        		return true;
        	}
        	if(fields[3] == fields[4] && fields[4] == fields[5] && fields[4] != 0){
        		return true;
        	}
        	if(fields[6] == fields[7] && fields[7] == fields[8] && fields[7] != 0){
        		return true;
        	}
        	if(fields[0] == fields[3] && fields[3] == fields[6] && fields[3] != 0){
        		return true;
        	}
        	if(fields[1] == fields[4] && fields[4] == fields[7] && fields[4] != 0){
        		return true;
        	}
        	if(fields[2] == fields[5] && fields[5] == fields[8] && fields[5] != 0){
        		return true;
        	}
        	if(fields[0] == fields[4] && fields[4] == fields[8] && fields[4] != 0){
        		return true;
        	}
        	if(fields[2] == fields[4] && fields[4] == fields[6] && fields[4] != 0){
        		return true;
        	}
        	return false;
        }

	public static boolean isTie(int[] fields){
        	if(isFull(fields) && !hasWon(fields)){
        		return true;
        	}
        	return false;
        }
}

