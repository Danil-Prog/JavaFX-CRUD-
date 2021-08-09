package com.gavrilov.javafx.Application;

import com.gavrilov.javafx.Controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        new Controller().getConnection();
        Parent root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
        primaryStage.setTitle("JavaFX CRUD");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icons/database_icon.png")));
        primaryStage.setScene(new Scene(root, 800, 480));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
