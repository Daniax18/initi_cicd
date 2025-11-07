module com.example.hellofx2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.hellofx2 to javafx.fxml;
    exports com.example.hellofx2;
}