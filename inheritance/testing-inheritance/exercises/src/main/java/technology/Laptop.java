package technology;

public class Laptop extends Computer{
    private int batteryLife;


   public Laptop(String brand, Integer storageSize, int year, int batteryLife){
       super(brand, storageSize, year);
       this.batteryLife = batteryLife;
   }
   public void webCam() {
       System.out.println("Using the webCam.");
   }
}
