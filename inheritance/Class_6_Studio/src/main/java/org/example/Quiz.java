package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;

    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public void addQuestion(TrueFalseQuestion question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Your answer: ");
            String response = scanner.nextLine().trim();
            if (question.checkAnswer(response)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
