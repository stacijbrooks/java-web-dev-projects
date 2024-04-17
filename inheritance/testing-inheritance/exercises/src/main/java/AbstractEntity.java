package technology;

import java.util.UUID;

// Define the AbstractEntity abstract class
public abstract class AbstractEntity {
    // Define a unique ID property
    private final UUID id;

    // Constructor to initialize the ID
    public AbstractEntity() {
        this.id = UUID.randomUUID();
    }

    // Method to get the ID
    public UUID getId() {
        return id;
    }
}
