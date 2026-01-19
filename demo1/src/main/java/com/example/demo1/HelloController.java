package com.example.demo1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    void openNewWindow(ActionEvent event) {
        Stage stage = new Stage();
        FXMLLoader mainLoader = new FXMLLoader(HelloApplication.class.getResource("e1.fxml"));
        Scene mainScene = null;
        try {
            mainScene = new Scene(mainLoader.load(), 600, 200);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Edit!");
        stage.setScene(mainScene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(btnAdd.getScene().getWindow());
        stage.show();
    }

    @FXML
    void new_Alert(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete");

        alert.setHeaderText("Увага!");
        alert.setContentText("Підтвердіть видалення поточного контакту!");
        alert.showAndWait();

    }

}