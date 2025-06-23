module com.zaidan.mavenproject1 {
    requires javafx.fxml;
    requires java.sql;
    requires  javafx.controls;


    opens com.zaidan.mavenproject1 to javafx.fxml;
    exports com.zaidan.mavenproject1;
}
