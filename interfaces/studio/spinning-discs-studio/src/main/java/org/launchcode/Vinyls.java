package org.launchcode;

public class Vinyls extends BaseDisc implements OpticalDisc{
    public Vinyls(double capacity, String name, String contents, String discType) {
        super(capacity, name, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println(" a vinyl spins at 33, 45, 78 rpm");
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
