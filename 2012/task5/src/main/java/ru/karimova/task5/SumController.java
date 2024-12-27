package ru.karimova.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    private TextField dTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private TextField qTextField;

    @FXML
    private TextField rTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button startButton;

    @FXML
    void startButtonOnAction(ActionEvent event) {
        try {
            double q = Double.parseDouble(qTextField.getText());
            double r = Double.parseDouble(rTextField.getText());
            double b = Double.parseDouble(bTextField.getText());
            double c = Double.parseDouble(cTextField.getText());
            double d = Double.parseDouble(dTextField.getText());
            int n = Integer.parseInt(nTextField.getText());


            if (n < 2) {
                resultLabel.setText("n должно быть ≥ 2");
                return;
            }

            double x0 = c;
            double x1 = d;
            double x;

            for (int i = 2; i <= n; i++) {
                x = q * x1 + r * x0 + b;
                x0 = x1;
                x1 = x;
            }

            resultLabel.setText(String.format("x%d = %.3f", n, x1));

        } catch (NumberFormatException e) {
            startButton.setText("Ошибка ввода");
        }
    }
}
