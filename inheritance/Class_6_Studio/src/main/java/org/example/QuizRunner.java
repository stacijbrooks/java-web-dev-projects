package org.example;

import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        // Creating quiz
        Quiz quiz = new Quiz();

        // Adding questions
        quiz.addQuestion(new MultipleChoiceQuestion(
                "What is the capital of France?",
                Arrays.asList("London", "Paris", "Berlin", "Rome"),
                1));

        quiz.addQuestion(new CheckboxQuestion(
                "Which animals are mammals?",
                Arrays.asList("Dog", "Snake", "Dolphin", "Frog", "Cat"),
                Arrays.asList(0, 2, 4)
        ));


        quiz.addQuestion(new TrueFalseQuestion(
                "Is the sun a star?",
                true));

        // Running quiz
        quiz.runQuiz();
    }
}
