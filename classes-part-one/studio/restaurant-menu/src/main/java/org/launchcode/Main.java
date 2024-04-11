package org.launchcode;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem item1 = new MenuItem("Red Curry", "A fragrant Thai dish with tender meat or veggies in a spicy coconut milk sauce.", 12.49, "main course");
        MenuItem item2 = new MenuItem("Thai Spring Rolls", "Crispy spring rolls filled with a delectable combination of fresh vegetables, vermicelli noodles, and aromatic Thai herbs. Served with a sweet chili dipping sauce.", 8.99, "appetizer");
        MenuItem item3 = new MenuItem("Pad Thai", "A classic Thai favorite featuring stir-fried rice noodles with tender chicken, shrimp, or tofu, complemented by eggs, bean sprouts, green onions, and crushed peanuts. Tossed in a tangy tamarind sauce.", 14.99, "main course");
        MenuItem item4 = new MenuItem("Mango Sticky Rice", "Indulge in the irresistible sweetness of ripe mango served atop a bed of fragrant sticky rice infused with creamy coconut milk. A delightful blend of flavors and textures, finished with a sprinkle of toasted sesame seeds.", 6.99, "dessert");
        MenuItem item5 = new MenuItem("Green Curry", "Experience the bold flavors of Thailand with our Green Curry, featuring succulent chicken, beef, or tofu cooked in a velvety green coconut milk-based sauce infused with aromatic Thai basil, keffir lime leaves, and green chili peppers.", 13.99, "main course");

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        menu.printMenu();

        // Print entire menu
        System.out.println("Entire Menu:");
        menu.printMenu();
        System.out.println();

        // Print individual menu item
        System.out.println("Individual Menu Item:");
        menu.printMenuItem(item1);
        System.out.println();

        // Check if menu item is new
        System.out.println("Is " + item1.getName() + " new? " + menu.isNewItem(item1));
        System.out.println();

        // Check last updated date
        System.out.println("Last updated: " + menu.getLastUpdated());
        System.out.println();

        // Attempt to add duplicate item
        MenuItem duplicateItem = new MenuItem("Red Curry", "Another fragrant Thai dish with tender meat or veggies in a spicy coconut milk sauce.", 15.99, "main course");
        menu.addItem(duplicateItem);
    }
}
