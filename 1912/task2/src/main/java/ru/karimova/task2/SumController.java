package ru.karimova.task2;

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
        resLabel.setText("Введите достоинство карты (6-14): ");
        int N = Integer.parseInt(nTextField.getText());

        resLabel.setText("Введите масть карты (1-4): ");
        int M = Integer.parseInt(nTextField.getText());

        String rank = "";
        String suit = "";

        switch (N) {
            case 11: rank = "валет"; break;
            case 12: rank = "дама"; break;
            case 13: rank = "король"; break;
            case 14: rank = "туз"; break;
            default: rank = String.valueOf(N); break;
        }

        switch (M) {
            case 1: suit = "пики"; break;
            case 2: suit = "трефы"; break;
            case 3: suit = "бубны"; break;
            case 4: suit = "червы"; break;
            default: suit = ""; break;
        }

        if (!suit.isEmpty()) {
            resLabel.setText(rank + " " + suit);
        } else {
          resLabel.setText("Некорректные входные данные.");
        }
    }
}

