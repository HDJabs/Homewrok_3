import fruitNinjaHelper.cs331FruitNinjaFrame;
import fruitNinjaHelper.cs331ScoreController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage primaryStage) {

        // Your code goes here!!
        cs331FruitNinjaFrame frame = new cs331FruitNinjaFrame(primaryStage);
        cs331ScoreController controller = new cs331ScoreController();
        Game game = new Game(controller);
        
        frame.addGame(game);      
        frame.setTop(controller);
        game.startGame();
        
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }

}
