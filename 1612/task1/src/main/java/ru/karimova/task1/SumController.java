package ru.karimova.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Label resLable;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float a=Float.parseFloat(aTextField.getText().toString());
        float b=Float.parseFloat(bTextField.getText().toString());
        resLable.setText("S="+(a+b));
    }

}
