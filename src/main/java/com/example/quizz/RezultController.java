package com.example.quizz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class RezultController {

    @FXML
    public Label remark, marks, marxstext, correcttext, wrongtext;

    @FXML
    public ProgressIndicator correct_progress, wrong_progress;

    @FXML
    private void initialize(){
        correcttext.setText("Correct Answer : "+String.valueOf(QuizController.correct));
        wrongtext.setText("Incorrect Answer : "+String.valueOf(QuizController.wrong));

        marks.setText(QuizController.correct+"/10");

        float  correctf=(float) QuizController.correct/10;
        correct_progress.setProgress(correctf);

        float  wrongf=(float) QuizController.wrong/10;
        correct_progress.setProgress(wrongf);

        int correct = QuizController.correct;
        if (correct<2){
            remark.setText("Oh..no! you have failed the quizz");

        } else if (correct>2 && correct<5) {
            remark.setText("Oops...! Have scored less marks");

        } else if (correct>=5 && correct<=7) {
            remark.setText("Good. A bit more improvement might  help yo to get better rezults.");

        } else if (correct==8 && correct==9) {
            remark.setText("Congratulation! Its you hardwork  and determinatoin which helped me.");

        } else if (correct==10) {
            remark.setText("Ooh...good !");

        }


    }

}
