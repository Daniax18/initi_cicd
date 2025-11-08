package com.example.hellofx2.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
        response.setText("I am clicked");
    }
}
