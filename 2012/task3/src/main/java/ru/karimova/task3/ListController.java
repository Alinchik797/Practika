package ru.karimova.task3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ListController {

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<String> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    private Button okButton;
    private ObservableList<String> prices;

    @FXML
    public void initialize() {
        prices = FXCollections.observableArrayList();
        dataListView.setItems(prices);
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        String input = numberTextField.getText();
        try {
            double pricePerKg = Double.parseDouble(input);
            if(pricePerKg > 0) {
                numberTextField.clear();
                calculateAndDisplayPrices(pricePerKg);
            } else {
                answerLabel.setText("Ошибка ввода, Цена должна быть положительной");
            }

        } catch (NumberFormatException e) {
            answerLabel.setText("Ошибка ввода, Введите корректное число");
        }



    }

    private void calculateAndDisplayPrices(double pricePerKg) {
        prices.clear();
        StringBuilder result = new StringBuilder();

        for (double weight = 0.1; weight <= 1.0; weight += 0.1) {
            double cost = pricePerKg * weight;
            String formattedResult = String.format("%.1f кг - %.2f", weight, cost);
            result.append(formattedResult).append("\n");
            prices.add(formattedResult);
        }
        answerLabel.setText(result.toString());
    }
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        prices.clear();
        answerLabel.setText("");

    }

    @FXML
    void OkButtonOnAction(ActionEvent event) {

    }

}