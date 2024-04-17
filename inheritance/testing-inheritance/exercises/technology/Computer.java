package technology;

// Define the Computer class
public class Computer extends AbstractEntity {
    // Properties
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Computer(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to get the brand
    public String getBrand() {
        return brand;
    }

    // Method to get the model
    public String getModel() {
        return model;
    }

    // Method to get the year
    public int getYear() {
        return year;
    }
}

