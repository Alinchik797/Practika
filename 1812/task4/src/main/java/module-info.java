module ru.karimova.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.karimova.task4 to javafx.fxml;
    exports ru.karimova.task4;
}