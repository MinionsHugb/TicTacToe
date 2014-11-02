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
        //final Move m = new Move();
       // final Board b = new Board();
            //Board b = new Board();
            //Move m = new Move();
            //boolean player1 = true;
            //char xoro = '';
            //while(!b.isFull(b.fields) || !b.hasWon(b.fields)){
                //b.PrintBoard(b.fields);
                post(new Route("/move"){
                    @Override
                    public Object handle(Request request, Response response){
                        //Integer button = Integer.valueOf(request.queryParams("move"));

                        return String("jón");


                      /*  if(player1){
                                //return "It's your turn Player 1!";
                                b.fields = Move.insertMove(1, b.fields, button);
                                xoro = 'X';
                                //return "Got pass insertMove";
                        }
                        else{
                                        //return "It's your turn Player 2!";
                        //button = 3;
                                        b.fields = m.insertMove(2, b.fields, button);
                                        xoro = 'O';
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
                        } */
                }
        });
    }
}
/*
public void init(){
        final  Move m = new Move();
        final Board b = new Board();

        post(new Route("/move"){
            @Override
            public Object handle(Request request, Response response){
                int tmp = 0;
                int [] tmpArr = m.insertMove(1,b.fields,tmp);
                char [] tmpChar = m.changeToChar(tmpArr);
                return tmpChar;
            }
        });
}
*/