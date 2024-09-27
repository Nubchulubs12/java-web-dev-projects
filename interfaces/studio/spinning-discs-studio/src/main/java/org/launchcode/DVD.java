package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    public DVD(double capacity, String name, String contents, String discType) {
        super(capacity, name, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storageCapacity() {
        System.out.println("this has " + capacity + " on it.");
    }

    @Override
    public void readData() {
        System.out.println("this is a " + contents + " disc");
    }

    @Override
    public void storageType() {
        System.out.println("this is a " + discType);
    }
// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
