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
	//final Board b = new Board();
	//Move.changeToChar(b.fields);
        post(new Route("/move"){
            @Override
            public Object handle(Request request, Response response){
        
	       //	Integer button = Integer.valueOf(request.queryParams("move"));
		return 3;
               }
         });
	}
}
