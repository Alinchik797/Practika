package ru.karimova.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class ListController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;
    private List<Integer> numbers = new ArrayList<>();


    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }

        try {
            int x = Integer.parseInt(numberTextField.getText());

            if (x >= 0 && x <= 300) {

                if(x == 0){
                    calculateAverage();
                    return;
                }
                numbers.add(x);
                dataListView.getItems().add(x);
                numberTextField.clear();

            }
            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Введите натуральное число от 0 до 300.");
                alert.show();
            }

        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Пожалуйста, введите целое число.");
            alert.show();
        }
    }


    @FXML
    void okButtonOnAction(ActionEvent event) {
        calculateAverage();
    }


    private void calculateAverage() {
        double sum = 0;
        int count = 0;

        for (int number : numbers) {
            if (number >= 100 && number <= 999) {
                sum += number;
                count++;
            }
        }
        if (count > 0) {
            double average = sum / count;
            answerLabel.setText(String.valueOf(average));

        } else {
            answerLabel.setText("NO");
        }
    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        dataListView.getItems().clear();
        answerLabel.setText("");
        numbers.clear();
    }
}