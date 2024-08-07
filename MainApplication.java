package com.example.assignment3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // We load the FXML file for the view
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/CurrencyConverterView.fxml"));

        // We create a scene with the loaded view
        Scene scene = new Scene(loader.load());

        // We set the title of the primary stage (main window)
        primaryStage.setTitle("Currency Converter");

        // We set the scene to the primary stage
        primaryStage.setScene(scene);

        // We show the primary stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        // We launch the JavaFX application
        launch(args);
    }
}
