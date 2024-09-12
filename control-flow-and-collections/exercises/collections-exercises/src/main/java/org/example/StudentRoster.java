package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        input.close();
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
    }
}