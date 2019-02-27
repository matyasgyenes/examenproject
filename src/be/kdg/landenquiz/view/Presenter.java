package be.kdg.landenquiz.view;

import be.kdg.landenquiz.model.LandenQuiz;

public class Presenter {
    private static final String IMAGE_PACKAGE = "be/kdg/landenquiz/view/images";
    private LandenQuiz model;
    private LandenQuizView view;

    public Presenter(LandenQuiz model, LandenQuizView view){
        this.model = model;
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void updateView(){

    }

    private void addEventHandlers(){

    }
}
