package ru.karimova.task03;

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
        int N = Integer.parseInt(nTextField.getText());
        double M = Double.parseDouble(nTextField.getText());
        double a = 0, c = 0, h = 0, S = 0;
        switch (N) {
            case 1:
                a = M;
                break;
            case 2:
                c = M;
                break;
            case 3:
                h = M;
                break;
            case 4:
                S = M;
                break;
            default:
                resLabel.setText("Некорректный номер элемента");
                return;    }
        if (N == 1) {
            c = a * Math.sqrt(2);
            h = c / 2;
            S = (c * h) / 2;
        } else if (N == 2) {
            c = M;
            a = c / Math.sqrt(2);
            h = c / 2;
            S = (c * h) / 2;
        } else if (N == 3) {
            h = M;
            c = M * 2;
            a = c / Math.sqrt(2);
            S = (c * h) / 2;
        } else if (N == 4) {
            S = M;
            c = Math.sqrt(2 * S);
            h = c / 2;
            a = c / Math.sqrt(2);
        }
        resLabel.setText(String.format("a=%.2f, c=%.2f, h=%.2f, S=%.2f", a, c, h, S));}
    }


