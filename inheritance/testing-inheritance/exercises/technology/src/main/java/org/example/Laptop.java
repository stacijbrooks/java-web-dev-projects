package technology;

// Define the Laptop class
public class Laptop extends Computer {
    // Additional property
    private double screenSize;

    // Constructor
    public Laptop(String brand, String model, int year, double screenSize) {
        super(brand, model, year);
        this.screenSize = screenSize;
    }

    // Additional method
    public double getScreenSize() {
        return screenSize;
    }
}

