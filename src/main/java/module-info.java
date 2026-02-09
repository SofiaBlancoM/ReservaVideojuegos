module org.example.reservavideojuegos {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.reservavideojuegos to javafx.fxml;
    exports org.example.reservavideojuegos;
}