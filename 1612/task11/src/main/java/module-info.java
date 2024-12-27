module ru.karimova.task11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.karimova.task11 to javafx.fxml;
    exports ru.karimova.task11;
}