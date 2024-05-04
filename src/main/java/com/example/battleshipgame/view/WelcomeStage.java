package com.example.battleshipgame.view;

import com.example.battleshipgame.controller.WelcomeController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeStage extends Stage {

    private final WelcomeController welcomeController;

    public WelcomeStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/battleshipgame/welcome-view.fxml"));
        Parent root = loader.load();
        welcomeController = loader.getController();
        Scene scene = new Scene(root);
        setTitle("Batalla Naval");
        getIcons().add(new Image(String.valueOf(getClass().getResource("/com/example/battleshipgame/images/battleship-icon.png"))));
        setResizable(false);
        setScene(scene);
        show();
    }

    public WelcomeController getWelcomeController() {
        return welcomeController;
    }

    private static class WelcomeStageHolder {
        private static WelcomeStage INSTANCE;
    }

    public static WelcomeStage getInstance() throws IOException {
        return WelcomeStageHolder.INSTANCE = new WelcomeStage();
    }

    public void deleteInstance() {
        WelcomeStageHolder.INSTANCE.close();
        WelcomeStageHolder.INSTANCE = null;
    }
}
