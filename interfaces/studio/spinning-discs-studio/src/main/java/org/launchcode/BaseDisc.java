package org.launchcode;

public abstract class BaseDisc {
    double capacity;
    String name;
    String contents;
    String discType;

    public BaseDisc(double capacity, String name, String contents, String discType) {
        this.capacity = capacity;
        this.name = name;
        this.contents = contents;
        this.discType = discType;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
