module ru.karimova.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.karimova.task1 to javafx.fxml;
    exports ru.karimova.task1;
}