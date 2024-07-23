package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioController {
    @FXML
    private TextField textId;

    @FXML
    private Button btnLogin;

    @FXML
    private void handlelogin() throws IOException {
        String id = textId.getText();
        if ("1234".equals(id)) {
            showAlert("Éxito", "Inicio de sesión exitoso", Alert.AlertType.INFORMATION);
            changeToVotacionScene();
        } else {
            showAlert("Error", "ID incorrecto", Alert.AlertType.ERROR);
        }
    }

    private void showAlert(String title, String content, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void changeToVotacionScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/votacion/View/candidatos-view.fxml"));
        Pane votacionPane = loader.load();
        Scene votacionScene = new Scene(votacionPane);


        Stage stage = (Stage) btnLogin.getScene().getWindow(); // Obtener el stage actual
        stage.setScene(votacionScene);
        stage.setTitle("Votaciones");
        stage.show();
    }
}

