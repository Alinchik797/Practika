module ru.karimova.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.karimova.task3 to javafx.fxml;
    exports ru.karimova.task3;
}