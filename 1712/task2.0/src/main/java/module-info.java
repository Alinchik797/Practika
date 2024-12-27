module ru.karimova.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.karimova.task2 to javafx.fxml;
    exports ru.karimova.task2;
}