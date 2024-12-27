package ru.karimova.task6;

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
    void resSumButtonOnAction(ActionEvent event) {

        int n = Integer.parseInt(nTextField.getText()); // Получаем целое число из TextField

        if (n <= 0) {
            resLabel.setText("Ошибка: Введите положительное целое число.");
            return; // Выходим из метода, если число не положительное
        }

        boolean hasOddDigit = false;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;  // Получаем последнюю цифру
            if (digit % 2 != 0) { // Проверяем, является ли цифра нечетной
                hasOddDigit = true;
                break; // Выходим из цикла, если нашли хотя бы одну нечетную
            }
            temp /= 10; // Удаляем последнюю цифру
        }
        resLabel.setText("Содержит нечетную цифру: " + hasOddDigit); // Выводим результат в Label
    }

    }


