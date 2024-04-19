package org.example;

public abstract class Question {
    protected String text;

    public Question(String text) {
        this.text = text;
    }

    public abstract void displayQuestion();
    public abstract boolean checkAnswer(String response);
}
