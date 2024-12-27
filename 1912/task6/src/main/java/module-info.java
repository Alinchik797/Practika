module ru.karimova.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.karimova.task6 to javafx.fxml;
    exports ru.karimova.task6;
}