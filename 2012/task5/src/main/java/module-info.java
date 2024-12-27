module ru.karimova.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.karimova.task5 to javafx.fxml;
    exports ru.karimova.task5;
}