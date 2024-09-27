package org.launchcode;

public class FloppyDisk extends BaseDisc implements OpticalDisc{


    public FloppyDisk(double capacity, String name, String contents, String discType) {
        super(capacity, name, contents, discType);
    }
    @Override
    public void spinDisc() {
        System.out.println("A floppy disk spins 300 rpm");
    }

    @Override
    public void storageCapacity() {
        System.out.println("this has " + capacity + " storage units on it.");
    }

    @Override
    public void readData() {
        System.out.println("this is a " + contents + " disc");
    }

    @Override
    public void storageType() {
        System.out.println("this is a " + discType + " disc");
    }
}
