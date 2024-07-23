module org.example.votacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.votacion to javafx.fxml;
    exports org.example.votacion;
    exports controller;
    opens controller to javafx.fxml;
}