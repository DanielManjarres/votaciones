package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class VotacionController {

    @FXML
    private Button btnCandidato1;

    @FXML
    private Button btnCandidato2;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        btnCandidato1.setOnAction(event -> seleccionarCandidato("Candidato 1"));
        btnCandidato2.setOnAction(event -> seleccionarCandidato("Candidato 2"));
    }

    private void seleccionarCandidato(String candidato) {
        resultLabel.setText("Ha seleccionado " + candidato);
    }
}
