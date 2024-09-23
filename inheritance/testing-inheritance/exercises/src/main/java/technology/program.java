package technology;

public class program {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("dell", 12, 2014,38);
        SmartPhone smartPhone = new SmartPhone("samsong", 4, 2020);

        laptop.turnOn();
        laptop.webCam();
        System.out.println("Laptop ID:" + laptop.getId());

        smartPhone.turnOn();
        smartPhone.texting();
        System.out.println("SmartPhone ID:" + smartPhone.getId());
    }

}

