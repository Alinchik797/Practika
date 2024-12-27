package ru.karimova.task11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        float a = Float.parseFloat(aTextField.getText().toString());
        resLabel.setText("V=" + (Math.pow(a, 3)) + "S=" + (6 * Math.pow(a, 2)));
    }



        }


