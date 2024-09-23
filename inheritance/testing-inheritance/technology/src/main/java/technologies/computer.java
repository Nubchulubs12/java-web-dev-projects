package technologies;

public class computer {
    private String brand;
    private Integer storageSize;
    private int year;

    public computer(String brand, Integer storageSize, int year){
        this.brand = brand;
        this.storageSize = storageSize;
        this.year= year;

    }
    public String turnOn() {

        return "Device is turned on.";
    }

    public String turnOff() {
        return "This device is turned off.";
    }

}
