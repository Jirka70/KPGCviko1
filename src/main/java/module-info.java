module org.example.cv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cv1 to javafx.fxml;
    exports org.example.cv1;
}