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

	String XorO;
	System.out.print(" ------------- \n");
	for (int i = 0; i < 9; i++)
	{
		System.out.print(" | ");
		if (f[i] == 1)
		{
			XorO = "X";
			System.out.print(XorO);
		}
		else if (f[i] == 2)
		{
			XorO = "O";
			System.out.print(XorO);
		}
		else
		{
			f[i] = i + 1;
			System.out.print(f[i]);
		}

		if (i == 2 || i == 5)
		{
			System.out.print(" |\n ------------- \n");
		}
	}
	System.out.print(" |\n -------------\n");
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

