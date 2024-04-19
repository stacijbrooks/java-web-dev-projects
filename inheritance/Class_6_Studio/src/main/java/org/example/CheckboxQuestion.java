package org.example;

import java.util.List;

public class CheckboxQuestion extends Question {
    // Declares private instance variables to store the options and indices of correct options
    private List<String> options;
    private List<Integer> correctOptionIndices;

    // Constructor for CheckboxQuestion class
    public CheckboxQuestion(String text, List<String> options, List<Integer> correctOptionIndices) {
        super(text); // Calls the constructor of the superclass (Question) with the provided text
        this.options = options; // Assigns the provided options to the instance variable
        this.correctOptionIndices = correctOptionIndices; // Assigns the provided correct option indices to the instance variable
    }

    // Overrides the displayQuestion method from the superclass
    @Override
    public void displayQuestion() {
        // Prints the text of the question
        System.out.println(text);
        // Iterates through each option and prints it along with its index
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    // Overrides the checkAnswer method from the superclass
    @Override
    public boolean checkAnswer(String response) {
        // Splits the response string by commas to get individual indices chosen by the user
        String[] chosenIndicesStr = response.split(",");
        // Iterates through each chosen index
        for (String indexStr : chosenIndicesStr) {
            // Parses the index string to an integer and subtracts 1 to convert from 1-based to 0-based index
            int chosenIndex = Integer.parseInt(indexStr) - 1;
            // Checks if the chosen index is in the list of correct option indices
            if (!correctOptionIndices.contains(chosenIndex)) {
                // If the chosen index is not in the list of correct option indices, returns false
                return false;
            }
        }
        // If all chosen indices are correct, returns true
        return true;
    }
}
