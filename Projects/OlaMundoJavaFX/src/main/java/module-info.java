module francisleysalla.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens francisleysalla.olamundojavafx to javafx.fxml;
    exports francisleysalla.olamundojavafx;
}
