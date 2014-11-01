package is.ru.tictactoe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class tictacWeb implements SparkApplication {
    public static void main(String[] args){
        staticFileLocation("/public");
        SparkApplication ticweb = new tictacWeb();
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
        ticweb.init();
    }

    public void init(){
        final Move m = new Move();
	final Board b = new Board();

        post(new Route("/move"){
            @Override
            public Object handle(Request request, Response response){
                Board b = new Board();
                Move m = new Move();
		int button;
                boolean player1 = true;
                while(!b.isFull(b.fields) || !b.hasWon(b.fields)){
                        b.PrintBoard(b.fields);
                        if(player1){
                                //return "It's your turn Player 1!";
				button = 2;
                                m.insertMove(1, b.fields, button);
                                //return "Got pass insertMove";
                        }
                        else{
                                //return "It's your turn Player 2!";
				button = 3;
                                m.insertMove(2, b.fields, button);
                        }
                        if(player1){
                                player1 = false;
                        }
                        else{
                                player1 = true;
                        }

                }
                if(b.isTie(b.fields)){
                        return "DRAW!";
                }
                else{
                        if(!player1){
                                return "VICTORY for Player 1";
                        }
                        else{
                                return "VICTORY for Player 2";
                        }
            }
	}
         });
}
}
