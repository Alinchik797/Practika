package ru.karimova.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField t1TextFIeld;

    @FXML
    private TextField t2TextFIeld;

    @FXML
    private TextField uTextFIeld;

    @FXML
    private TextField vTextFIeld;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
            float V = Float.parseFloat(vTextFIeld.getText());
            float U = Float.parseFloat(uTextFIeld.getText());
            float T1 = Float.parseFloat(t1TextFIeld.getText());
            float T2 = Float.parseFloat(t2TextFIeld.getText());

            // Расчет пути
            float S = T1 * V + T2 * (V - U);
            resLabel.setText("S = " + S + " км");
        }
    }
