package org.example;

import java.util.List;

public class CheckboxQuestion extends Question {
    private List<String> options;
    private List<Integer> correctOptionIndices;

    public CheckboxQuestion(String text, List<String> options, List<Integer> correctOptionIndices) {
        super(text);
        this.options = options;
        this.correctOptionIndices = correctOptionIndices;
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
        String[] chosenIndicesStr = response.split(",");
        for (String indexStr : chosenIndicesStr) {
            int chosenIndex = Integer.parseInt(indexStr) - 1;
            if (!correctOptionIndices.contains(chosenIndex)) {
                return false;
            }
        }
        return true;
    }
}
