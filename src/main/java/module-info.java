module com.mycompany.execise1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.execise1 to javafx.fxml;
    exports com.mycompany.execise1;
}
