package org.example;

public class TrueFalseQuestion extends Question {
    private boolean correctAnswer;

    public TrueFalseQuestion(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(text);
        System.out.println("1. True");
        System.out.println("2. False");
    }

    @Override
    public boolean checkAnswer(String response) {
        boolean chosenAnswer = response.equalsIgnoreCase("true") || response.equals("1");
        return chosenAnswer == correctAnswer;
    }
}
