package ru.karimova.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField n2TextField;

    @FXML
    private TextField n3TextField;

    @FXML
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTextField.getText());
        int N2 = Integer.parseInt(n2TextField.getText());
        int N3 = Integer.parseInt(n3TextField.getText());

        int countPositive = 0;
        int countNegative = 0;

        if (N > 0) { countPositive++; } else if (N < 0) { countNegative++; }
        if (N2 > 0) { countPositive++; } else if (N2 < 0) { countNegative++; }
        if (N3 > 0) { countPositive++; } else if (N3 < 0) { countNegative++; }

        resLabel.setText("Положительных: " + countPositive + ", Отрицательных: " + countNegative);
    }

}
