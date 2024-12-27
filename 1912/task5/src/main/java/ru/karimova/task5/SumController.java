package ru.karimova.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
            int n = Integer.parseInt(nTextField.getText().toString());
            int k = 0;
            int sum = 0;
            while (sum < n) {
                k++;
                sum = sum + k;
            }
            resLabel.setText(" "+k);
            resLabel.setText(" " + sum);
        }
    }
