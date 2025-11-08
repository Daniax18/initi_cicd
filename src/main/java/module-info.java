module com.example.hellofx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.hellofx2 to javafx.fxml;
    exports com.example.hellofx2.app;
    opens com.example.hellofx2.app to javafx.fxml;
    exports com.example.hellofx2.controller;
    opens com.example.hellofx2.controller to javafx.fxml;
}