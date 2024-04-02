package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Print a prompt asking the user to enter the radius
        System.out.println("Enter a radius:");
        // Read a double value from user input and store it in the variable 'radius'
        double radius = scanner.nextDouble();
        // Call the getArea method from Circle class to calculate the area of the circle
        double area = Circle.getArea(radius);
        // Print the calculated area to the console
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
        // Close the Scanner object to release system resources
        scanner.close();
    }
}