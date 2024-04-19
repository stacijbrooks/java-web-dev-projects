package org.example;

public class TrueFalseQuestion extends Question {
    // Declares a private instance variable to store the correct answer (true or false)
    private boolean correctAnswer;

    // Constructor for TrueFalseQuestion class
    public TrueFalseQuestion(String text, boolean correctAnswer) {
        super(text); // Calls the constructor of the superclass (Question) with the provided text
        this.correctAnswer = correctAnswer; // Assigns the provided correct answer to the instance variable
    }

    // Overrides the displayQuestion method from the superclass
    @Override
    public void displayQuestion() {
        // Prints the text of the question
        System.out.println(text);
        // Prints the options for true/false (1. True and 2. False)
        System.out.println("1. True");
        System.out.println("2. False");
    }

    // Overrides the checkAnswer method from the superclass
    @Override
    public boolean checkAnswer(String response) {
        // Checks if the response is "true" (case insensitive) or "1"
        boolean chosenAnswer = response.equalsIgnoreCase("true") || response.equals("1");
        // Checks if the chosen answer matches the correct answer and returns the result
        return chosenAnswer == correctAnswer;
    }
}
