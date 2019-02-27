package be.kdg.landenquiz;

import be.kdg.landenquiz.model.LandenQuiz;
import be.kdg.landenquiz.view.LandenQuizView;
import be.kdg.landenquiz.view.Presenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage){
        LandenQuiz model = new LandenQuiz();
        LandenQuizView view = new LandenQuizView();
        Presenter presenter = new Presenter(model,view);
        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
