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
        final Move tic = new Move();
	final Board b = new Board();

        post(new Route("/move"){
            @Override
            public Object handle(Request request, Response response){
                int [] letter = tic.insertMove(1,b.fields,4);
                return letter;
            }
        });
    }
}
