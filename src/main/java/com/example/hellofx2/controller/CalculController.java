package com.example.hellofx2.controller;

import com.example.hellofx2.model.MyCalcul;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;

public class CalculController {

    public TextField value1, value2;
    public Button calculateBtn;
    public Label response;

    @FXML
    private ComboBox<String> chooseOperation;

    @FXML
    public void initialize(){
        chooseOperation.getItems().addAll("+", "-");
        chooseOperation.setValue("+");
    }

    @FXML
    protected void onClicked(){
        try {
            MyCalcul calcul = new MyCalcul(value1.getText(), value2.getText());
            int result = calcul.calculate(chooseOperation.getValue());
            response.setText("Response: " + result);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
            alert.getDialogPane().setMinWidth(Region.USE_PREF_SIZE);

            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }
}
