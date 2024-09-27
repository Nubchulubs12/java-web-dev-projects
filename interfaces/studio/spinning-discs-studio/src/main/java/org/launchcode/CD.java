package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.

    public CD(double capacity, String name, String contents, String discType) {
        super(capacity, name, contents, discType);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
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
}
