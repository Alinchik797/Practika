package ru.karimova.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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


    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> scores = dataListView.getItems();
        if (scores.isEmpty()) {
            answerLabel.setText("Нет данных об участниках.");
            return;
        }
        int maxScore = 0;
        boolean hasZeroScore = false;

        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
            if (score == 0) {
                hasZeroScore = true;
            }
        }

        answerLabel.setText("ответил на " + maxScore + " вопросов.\n" +
                (hasZeroScore ? "YES" : "NO"));
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText());
            if (x >= 0 && x <= 20) {
                dataListView.getItems().add(x);
                numberTextField.clear();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Введите количество правильных ответов от 0 до 20");
                alert.show();
            }

        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Пожалуйста, введите целое число");
            alert.show();
        }
    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        dataListView.getItems().clear();
        answerLabel.setText("");
    }
}