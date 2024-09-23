package technology;

public class SmartPhone extends Computer{
    private String handHeld;

    public SmartPhone(String brand, Integer storageSize, int year){
        super(brand, storageSize, year);
        this.handHeld = handHeld;
    }
    public void texting() {
        System.out.println("currently texting from anywhere.");
    }
}
