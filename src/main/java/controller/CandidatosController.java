package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class CandidatosController {
    @FXML
    private Button btnVotar;

    @FXML
    private void initialize() {
        btnVotar.setOnAction(event -> {
            try {
                changeToVotacionScene();
            } catch (IOException e) {
                showAlert("Error", "No se pudo cambiar a la ventana de votación", AlertType.ERROR);
            }
        });
    }

    private void showAlert(String title, String content, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void changeToVotacionScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/votacion/View/votacion-view.fxml"));
        Pane votacionPane = loader.load();
        Scene votacionScene = new Scene(votacionPane);

        Stage stage = (Stage) btnVotar.getScene().getWindow(); // Obtener el stage actual
        stage.setScene(votacionScene);
        stage.setTitle("Votaciones");
        stage.show();
    }
}




