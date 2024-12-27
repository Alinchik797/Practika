package ru.karimova.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float A=Float.parseFloat(aTextField.getText().toString());
        float B=Float.parseFloat(bTextField.getText().toString());
        float M=Float.parseFloat(bTextField.getText().toString());
        float X=Float.parseFloat(bTextField.getText().toString());
        if (A * B * B - Math.sin(B * B) + M * B > 0) {
            double y;
            if (X > Math.PI) {
                y = 1 - Math.exp(-A * X) * Math.sin(A * X + B);
            } else if (X >= -Math.PI && X <= Math.PI) {
                y = 1 - Math.exp(-A * X) * (A * X + B);
            } else {
                y = 1 - (Math.exp(-A * X) + Math.exp(-B * X));
            }
            resLabel.setText("Значение функции y: " + y);
        } else {
            resLabel.setText("Условия не выполнены.");
        }

    }
}

