package be.kdg.landenquiz.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class LandenQuizView extends GridPane {
    private Button btnTest;

    public LandenQuizView(){
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes(){
        btnTest = new Button("TEST");
        btnTest.setPrefWidth(80);
    }

    private void layoutNodes(){
        this.setPadding(new Insets(10));
        GridPane.setHalignment(btnTest, HPos.CENTER);
        this.add(btnTest,0,1,2,1);
    }
}
