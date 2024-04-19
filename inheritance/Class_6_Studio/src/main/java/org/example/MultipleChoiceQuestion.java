package org.example;

import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> options;
    private int correctOptionIndex;

    public MultipleChoiceQuestion(String text, List<String> options, int correctOptionIndex) {
        super(text);
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    @Override
    public void displayQuestion() {
        System.out.println(text);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        int chosenIndex = Integer.parseInt(response) - 1;
        return chosenIndex == correctOptionIndex;
    }
}

