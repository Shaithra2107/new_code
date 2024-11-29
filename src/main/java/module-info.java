module com.example.news_rexommendation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.news_rexommendation to javafx.fxml;
    exports com.example.news_rexommendation;
}