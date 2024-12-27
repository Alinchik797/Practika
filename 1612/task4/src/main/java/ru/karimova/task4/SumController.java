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
    private TextField pTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField xTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double p = Double.parseDouble(pTextField.getText());
        double x = Double.parseDouble(xTextField.getText());
        double a = Double.parseDouble(aTextField.getText());  // Добавляем получение 'a'

        if (Math.abs(Math.cos(x)) < 1e-9) { // Проверка на ноль с погрешностью
            resLabel.setText("Ошибка: cos(x) равен 0.");
            return;
        }
        if (Math.abs(Math.tan(x / 2)) < 1e-9) { // Проверка на ноль с погрешностью
            resLabel.setText("Ошибка: tan(x/2) равен 0.");
            return;
        }


        double pValue = 1 / Math.cos(x) + Math.log(Math.abs(Math.tan(x / 2))) + (x / (1 + (x / (1 + x))));
        double alpha = (Math.pow(pValue, 5) * Math.cbrt(a * Math.pow(x, 3) + 2)) / (2 * Math.cos(x));


        resLabel.setText("При p = " + String.format("%.3f", pValue) + "  alpha = " + String.format("%.3f", alpha));


    }
}


