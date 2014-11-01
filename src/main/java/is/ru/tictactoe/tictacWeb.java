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
        final tictactoe tic = new tictactoe();
/*

        post(new Route("/random"){
            @Override
            public Object handle(Request request, Response response){
                String joke = chuckjoke.getRandom();
                return joke;

            }

        });
*/
    }
}
