package com.example.battleshipgame;

import com.example.battleshipgame.view.WelcomeStage;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    /**
     * @param stage Stage of the game
     * @throws Exception Throws an exception if the welcome stage instance gets an error
     */
    @Override
    public void start(Stage stage) throws Exception {
        WelcomeStage.getInstance();
    }
}
