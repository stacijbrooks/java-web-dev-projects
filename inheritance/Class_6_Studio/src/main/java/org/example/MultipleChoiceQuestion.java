package org.example;

import java.util.List;

//This is inheritance. MultipleChoiceQuestion extends the Question class.
public class MultipleChoiceQuestion extends Question {
    //Creating a list that can only hold strings.
    private List<String> options;
    private int correctOptionIndex;

    public MultipleChoiceQuestion(String text, List<String> options, int correctOptionIndex) {
        //That's where super(text) comes into play. The super keyword is used to call the constructor of the superclass.
        // In this case, super(text) is calling the constructor of the Question class and passing the text parameter to it.
        super(text);
        //Listing all the possible options (answers) to the question.
        this.options = options;
        //this is holding or remembering the right answer.
        this.correctOptionIndex = correctOptionIndex;
    }

    @Override
    // This annotation indicates that the method displayQuestion overrides a method from the superclass (Question).
    public void displayQuestion() {
        System.out.println(text);
        //loops through each option in the list of options
        for (int i = 0; i < options.size(); i++) {
            // Inside the loop, this line prints each option number (starting from 1) followed by the option text. options.get(i) retrieves the option text at index i from the options list.
            // The (i + 1) is used to display option numbers starting from 1 instead of 0.
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    @Override // Indicates that this method overrides a method from the superclass
    // Defines a method called checkAnswer, which checks if the provided response is correct
    public boolean checkAnswer(String response) {
        // Converts the response string to an integer and subtracts 1 to convert from 1-based index to 0-based index
        int chosenIndex = Integer.parseInt(response) - 1;
        // Checks if the chosen index matches the correct option index and returns true if they match, otherwise false
        return chosenIndex == correctOptionIndex;
    }
}
