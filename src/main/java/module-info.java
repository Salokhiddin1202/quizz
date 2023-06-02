module com.example.quizz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quizz to javafx.fxml;
    exports com.example.quizz;
}