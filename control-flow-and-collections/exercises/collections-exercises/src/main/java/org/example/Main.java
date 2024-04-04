package org.example;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3,5, 8};

        //2. Loop through the array and print out each value
        System.out.println("All numbers in the array: ");
        for(int num : integerArray) {
            System.out.println(num);
        }

        // Modify the loop to only print the odd numbers
        System.out.println("Odd numbers int he array: ");
        for (int num : integerArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        //3. Use split method
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        //4. Print the array of words
        System.out.println("Individual words in the string: ");


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}