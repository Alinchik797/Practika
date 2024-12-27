package ru.karimova.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button startButton;

    @FXML
    private TextField xTextField;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        try {
            double x = Double.parseDouble(xTextField.getText());
            int n = Integer.parseInt(nTextField.getText());

            if (n <= 0) {
                startButton.setText("N должно быть больше 0");
                return;
            }

            double result = calculateSinApproximation(x, n);
            resultLabel.setText(String.format("Приближенное значение sin(%.2f): %.10f", x, result));

        } catch (NumberFormatException ex) {
            startButton.setText("Некорректный ввод");
        } finally {
            xTextField.setText("");
            nTextField.setText("");
        }
    }


    private double calculateSinApproximation(double x, int n) {
        double result = 0.0;
        double pow = 1.0;
        double factorial = 1.0;

        for (int i = 1; i <= 2 * n + 1; i++) {
            factorial *= i;
            pow *= x;

            if (i % 2 != 0) {
                result += pow / factorial;
                pow *= -1;
            }
        }
        return result;
    }
}