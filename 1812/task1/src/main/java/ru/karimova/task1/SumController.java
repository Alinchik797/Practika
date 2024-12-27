package ru.karimova.task1;

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
        int N = Integer.parseInt(nTextField.getText().toString());
        if (N >= 10 && N <= 99) {
            int N1 = N / 10;
            int N2 = N % 10;
            if ( N1== N2 ) {
                resLabel.setText("Все цифры одинаковые.");
            } else {
                resLabel.setText("Цифры не одинаковые.");
            }
        } else {
            resLabel.setText("Введите двузначное число.");
        }
    }
}