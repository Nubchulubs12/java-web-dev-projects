package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Double radius = null;
        while (radius == null || radius < 0) {
            System.out.println("Enter the radius:");

            if (input.hasNextDouble()) {
                radius = input.nextDouble();

            } else  {
                System.out.println("Error: Radius must be a positive number.");

            }
        }


double area = circle.getArea(radius);

System.out.println("the area of a circle of radius " + radius + " is: " + area );

    }
}
