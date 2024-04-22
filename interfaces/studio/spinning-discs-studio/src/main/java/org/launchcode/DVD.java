package org.launchcode;

// DVD class representing a digital versatile disc
public class DVD extends BaseDisc implements OpticalDisc {
    // Constructor
    public DVD(String name, String contents) {
        super(name, "DVD", contents);
    }

    // Override spinDisc method with DVD-specific behavior
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    // Implement writeData method specific to DVDs
    @Override
    public void writeData() {
        // Write data to DVD
    }

    // Implement readData method specific to DVDs
    @Override
    public void readData() {
        // Read data from DVD
    }
}

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

