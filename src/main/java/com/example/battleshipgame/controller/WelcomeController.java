package com.example.battleshipgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WelcomeController {

    private ImageView welcomeImage;

    @FXML
    public void initialize() {
        /*Image image = new Image(getClass().getResourceAsStream("/com/example/battleshipgame/images/battleship-icon.png"));
        welcomeImage.setImage(image);*/
    }

    public void onHandleButtonPlay(ActionEvent event) {
        System.out.println("A jugar!!");
    }
}
