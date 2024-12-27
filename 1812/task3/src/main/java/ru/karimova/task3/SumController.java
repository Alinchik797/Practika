package ru.karimova.task3;

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
        int num1 = Integer.parseInt(nTextField.getText());
        int num2 = Integer.parseInt(n2TextField.getText());
        int num3 = Integer.parseInt(n3TextField.getText());

        int max1, max2;

        if (num1 > num2) {
            if (num1 > num3) {
                max1 = num1;
                max2 = Math.max(num2, num3);
            } else {
                max1 = num3;
                max2 = num1;
            }
        } else {
            if (num2 > num3) {
                max1 = num2;
                max2 = Math.max(num1, num3);
            } else {
                max1 = num3;
                max2 = num2;
            }
        }

        int sum = max1 + max2;
        resLabel.setText("Сумма двух наибольших: " + sum);
    }

}
