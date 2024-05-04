package com.example.battleshipgame.view.alert;

import javafx.scene.control.Alert;

public interface IAlertBox {
    void showAlertMessage(String title, String header, String content, Alert.AlertType alertType);
}
