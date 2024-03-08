module com.example.testsonarcloud2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testsonarcloud2 to javafx.fxml;
    exports com.example.testsonarcloud2;
}