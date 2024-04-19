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
                "Which are colors of the rainbow?",
                Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple"),
                Arrays.asList(0, 2, 3)));

        quiz.addQuestion(new TrueFalseQuestion(
                "Is the sun a star?",
                true));

        // Running quiz
        quiz.runQuiz();
    }
}
