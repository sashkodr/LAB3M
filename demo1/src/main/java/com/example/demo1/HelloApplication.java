package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader mainLoader = new FXMLLoader(HelloApplication.class.getResource("e2.fxml"));
        Scene mainScene = new Scene(mainLoader.load(), 600, 550);
        stage.setTitle("Hello!");
        stage.setScene(mainScene);
        stage.setMinWidth(600);
        stage.setMinHeight(550);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}