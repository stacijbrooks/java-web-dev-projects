// File: Menu.java
package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    // Private fields to store menu items and last updated date
    private List<MenuItem> menuItems;
    private LocalDate lastUpdated;

    // Constructor to initialize the menu with an empty list of menu items and set the last updated date to today
    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = LocalDate.now();
    }

    // Method to add a new menu item to the menu
    public void addItem(MenuItem item) {
        // Check if the menu item is already on the menu
        if (!menuItems.contains(item)) {
            // If not, add it to the menu and update the last updated date
            menuItems.add(item);
            lastUpdated = LocalDate.now();
            System.out.println("Item added to the menu: " + item.getName());
        } else {
            // If the item is already on the menu, print a message
            System.out.println("Item is already on the menu: " + item.getName());
        }
    }

    // Method to remove a menu item from the menu
    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
        System.out.println("Item removed from the menu: " + item.getName());
    }

    // Method to check if a menu item is new
    public boolean isNewItem(MenuItem item) {
        return item.isNew();
    }

    // Getter method to retrieve the last updated date of the menu
    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    // Method to print the details of a specific menu item
    public void printMenuItem(MenuItem item) {
        System.out.println(item);
    }

    // Method to print the entire menu
    public void printMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menuItems) {
            System.out.println(item);
        }
    }

    // Method to compare two menu items for equality
    public boolean equals(MenuItem item1, MenuItem item2) {
        return item1.equals(item2);
    }
}
