package org.launchcode;

public class Main {
    public static void main(String[] args) {
//CD myCd =  new CD(1, "cd", "cool music", "homemade");
//        // TODO: Declare and initialize a CD and a DVD object.
//
//
//DVD myDvd = new DVD(2,"The dvd", "movie", "blue ray");
////test1
//myDvd.spinDisc();
//myCd.spinDisc();
//
////test2
//myCd.storageCapacity();
//
//myDvd.storageCapacity();
//
////test3
//myDvd.readData();
//myCd.readData();
//
////test4
//myDvd.storageType();
//myCd.storageType();

        FloppyDisk flobby = new FloppyDisk(4, "Mr Flobby", "Dwarf Fortress", "Ancient");

//        test1
        flobby.spinDisc();
        flobby.readData();
        flobby.storageCapacity();
        flobby.storageType();

        Vinyls vinny = new Vinyls(5, "Vinny", "Music", "The first artifact of music");

//        test2
        vinny.spinDisc();
        vinny.readData();
        vinny.storageCapacity();
        vinny.storageType();
        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}