package org.example.votacion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VotacionApp extends Application {
    @Override
    public void start(Stage primeraStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/votacion/View/Inicio-view.fxml"));
        Scene scene = new Scene(root);
        primeraStage.setScene(scene);
        primeraStage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}