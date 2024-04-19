package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    // Declares a private instance variable to store the list of questions
    private List<Question> questions;

    // Constructor for Quiz class
    public Quiz() {
        // Initializes the list of questions as an empty ArrayList
        this.questions = new ArrayList<>();
    }

    // Method to add a true/false question to the quiz
    public void addQuestion(TrueFalseQuestion question) {
        // Adds the provided true/false question to the list of questions
        questions.add(question);
    }

    // Method to run the quiz
    public void runQuiz() {
        // Creates a new scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Iterates through each question in the list of questions
        for (Question question : questions) {
            // Displays the question to the user
            question.displayQuestion();
            // Prompts the user to input their answer
            System.out.print("Your answer: ");
            // Reads the user's response from the console and removes leading/trailing whitespace
            String response = scanner.nextLine().trim();
            // Checks if the user's response is correct and provides feedback
            if (question.checkAnswer(response)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
            // Prints a blank line for formatting purposes
            System.out.println();
        }
        // Closes the scanner to release system resources
        scanner.close();
    }

    // Method to add a general question to the quiz
    public void addQuestion(Question question) {
        // Adds the provided general question to the list of questions
        questions.add(question);
    }
}
