package ru.karimova.task5;

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
    private TextField xTextField;

    @FXML
    private TextField yTextField;

    @FXML
    void sumButtonOnAction(ActionEvent event) {

        float X = Float.parseFloat(xTextField.getText().toString());
        float Y = Float.parseFloat(yTextField.getText().toString());

        if (Math.pow(X, 2) + Math.pow(Y, 2) == 144 || Y == X) {
            resLabel.setText("На границе");
        } else if (Y < X && Math.pow(X, 2) + Math.pow(Y, 2) < 144) {
                resLabel.setText("Да");
            } else{
                    resLabel.setText("Нет");
                }
                }
            }
