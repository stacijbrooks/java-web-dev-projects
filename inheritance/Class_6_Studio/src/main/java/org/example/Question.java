package org.example;

//This line defines a class named Question as abstract.
// Abstract classes cannot be instantiated directly; they serve as blueprints for other classes to inherit from.
public abstract class Question {
    // Declares a protected instance variable to store the text of the question
    protected String text;

    // Constructor for the Question class
    public Question(String text) {
        // Initializes the text of the question with the provided text
        this.text = text;
    }

    // Abstract method to display the question (to be implemented by subclasses)
    public abstract void displayQuestion();

    // Abstract method to check the answer to the question (to be implemented by subclasses)
    public abstract boolean checkAnswer(String response);
}
