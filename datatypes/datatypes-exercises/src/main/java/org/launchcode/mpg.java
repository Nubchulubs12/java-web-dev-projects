package org.launchcode;
import java.util.Scanner;
public class mpg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven on your tank of gas?");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas has been used?");
        double gallons = input.nextDouble();

        double mpg = miles/gallons;

        System.out.println("Heres your mpg: " + mpg);

    }
}
