package org.example;
import java.io.File;
import java.util.Scanner;
import java.util.HashMap;

import java.io.FileNotFoundException;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> record = new HashMap<>();
        System.out.println("Enter a sentence please.");
        Scanner input;
        input = new Scanner(System.in);
        String text = input.nextLine();
        text = text.toUpperCase();
        input.close();
        try {
            File myObj = new File("filename.text");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



//        String text = "If the product of two terms is zero then common sense says at least one of the two terms has " +
//                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into" +
//                " a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that," +
//                " it’s pretty straightforward from there";

        char[] charactersInString = text.toCharArray();
        char current;
        for (int i = 0; i < charactersInString.length; i++) {
            current = charactersInString[i];
            if (Character.isLetter(current)) {
            if (!record.containsKey(current)) {
                record.put(current, 1);
            } else {
                record.put(current, record.get(current)+1);

            }
            }


        }
        for (Character letter : record.keySet()) {
            System.out.println(letter + ": " + record.get(letter));
        }

    }

}
