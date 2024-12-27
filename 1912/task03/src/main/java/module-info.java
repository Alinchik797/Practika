module ru.karimova.task03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.karimova.task03 to javafx.fxml;
    exports ru.karimova.task03;
}