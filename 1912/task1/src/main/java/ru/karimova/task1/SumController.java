package ru.karimova.task1;

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
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {

        int N = Integer.parseInt(nTextField.getText());

       resLabel.setText("Введите первое число A: ");
        double A = Double.parseDouble(aTextField.getText());

        resLabel.setText("Введите второе число B: ");
        double B = Double.parseDouble(bTextField.getText());

        double result = 0;

        switch (N) {
            case 1: // сложение
                result = A + B;
                break;
            case 2: // вычитание
                result = A - B;
                break;
            case 3: // умножение
                result = A * B;
                break;
            case 4: // деление
                result = A / B;
                break;
            default:
                resLabel.setText("Некорректный номер действия.");
                return;
        }

        resLabel.setText("Результат: " + result);
    }

}
