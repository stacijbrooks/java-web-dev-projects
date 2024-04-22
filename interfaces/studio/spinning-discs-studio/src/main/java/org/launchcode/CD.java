package org.launchcode;

// CD class representing a compact disc
public class CD extends BaseDisc implements OpticalDisc {
    // Constructor
    public CD(String name, String contents) {
        super(name, "CD", contents);
    }

    // Override spinDisc method with CD-specific behavior
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    // Implement writeData method specific to CDs
    @Override
    public void writeData() {
        // Write data to CD
    }

    // Implement readData method specific to CDs
    @Override
    public void readData() {
        // Read data from CD
    }
}

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

