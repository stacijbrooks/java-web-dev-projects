package org.launchcode;

import java.util.Comparator;

// Define a public class named ConeComparator which implements the Comparator interface for Cone objects
public class ConeComparator implements Comparator<Cone> {

    // Override the compare method defined in the Comparator interface
    @Override
    public int compare(Cone cone1, Cone cone2) {

        // Check if the cost of the first cone is less than the cost of the second cone
        if (cone1.getCost() - cone2.getCost() < 0){

            // If so, return -1 indicating that the first cone should come before the second cone
            return -1;

            // Check if the cost of the first cone is greater than the cost of the second cone
        } else if (cone1.getCost() - cone2.getCost() > 0) {

            // If so, return 1 indicating that the first cone should come after the second cone
            return 1;

            // If the costs are equal
        } else {

            // Return 0 indicating that the order of the two cones doesn't matter (they are equal)
            return 0;
        }
    }
}
