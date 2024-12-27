module ru.karimova.karimova {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.karimova.karimova to javafx.fxml;
    exports ru.karimova.karimova;
    exports ru.karimova.karimova.controller;
    opens ru.karimova.karimova.controller to javafx.fxml;
}