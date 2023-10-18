module com.example.redtext {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.redtext to javafx.fxml;
    exports com.example.redtext;
}