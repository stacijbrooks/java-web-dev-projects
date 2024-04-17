package technology;

// Define the SmartPhone class
public class SmartPhone extends Computer {
    // Additional property
    private boolean hasTouchScreen;

    // Constructor
    public SmartPhone(String brand, String model, int year, boolean hasTouchScreen) {
        super(brand, model, year);
        this.hasTouchScreen = hasTouchScreen;
    }

    // Additional method
    public boolean hasTouchScreen() {
        return hasTouchScreen;
    }
}

