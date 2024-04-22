package org.launchcode;

// Abstract class serving as a base for CD and DVD classes
public abstract class BaseDisc {
    // Fields shared by CD and DVD
    protected String name;
    protected String discType;
    protected String contents;

    // Constructor
    public BaseDisc(String name, String discType, String contents) {
        this.name = name;
        this.discType = discType;
        this.contents = contents;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    // Custom method to report disc information
    public void reportInfo() {
        System.out.println("Disc Name: " + name);
        System.out.println("Disc Type: " + discType);
        System.out.println("Contents: " + contents);
    }

    // Abstract method to spin the disc
    public abstract void spinDisc();
}

