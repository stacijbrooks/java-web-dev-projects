package org.example;

import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        // Creating a new Quiz object
        Quiz quiz = new Quiz();

        // Adding questions to the quiz
        // Adding a multiple choice question about the capital of France
        quiz.addQuestion(new MultipleChoiceQuestion(
                "What is the capital of France?",
                Arrays.asList("London", "Paris", "Berlin", "Rome"), // List of options
                1)); // Index of correct option

        // Adding a checkbox question about mammals
        quiz.addQuestion(new CheckboxQuestion(
                "Which animals are mammals?",
                Arrays.asList("Dog", "Snake", "Dolphin", "Frog", "Cat"), // List of options
                Arrays.asList(0, 2, 4))); // List of indices of correct options

        // Adding a true/false question about the sun
        quiz.addQuestion(new TrueFalseQuestion(
                "Is the sun a star?",
                true)); // Correct answer is true

        // Running the quiz
        quiz.runQuiz();
    }
}

