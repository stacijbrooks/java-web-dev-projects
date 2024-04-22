package org.launchcode;

// OpticalDisc interface defining common behaviors for CDs and DVDs
public interface OpticalDisc {
    // Method to spin the disc
    void spinDisc();

    // Method to store data on the disc
    void writeData();

    // Method to read data from the disc
    void readData();

    // Method to report disc information
    void reportInfo();
}

