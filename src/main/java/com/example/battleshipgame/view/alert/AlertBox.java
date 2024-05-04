package com.example.battleshipgame.view.alert;

import javafx.scene.control.Alert;

public class AlertBox implements IAlertBox{
    /**
     * @param title Title of the alert
     * @param header Header of the alert
     * @param content Content of the alert
     * @param alertType Type of the alert
     */
    @Override
    public void showAlertMessage(String title, String header, String content, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
