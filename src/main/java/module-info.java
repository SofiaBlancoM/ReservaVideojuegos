module org.example.reservavideojuegos {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.reservavideojuegos to javafx.fxml;
    exports org.example.reservavideojuegos;
    exports org.example.reservavideojuegos.controller;
    opens org.example.reservavideojuegos.controller to javafx.fxml;
}