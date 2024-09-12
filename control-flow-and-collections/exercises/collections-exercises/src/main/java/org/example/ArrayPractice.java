package org.example;
import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
//        int[] integerArray = {1, 1, 2, 3, 5, 8};
//        for (int number : integerArray) {
//            System.out.println(number);
//        }
//        System.out.println("odds");
//        for (int number : integerArray) {
//            if (number % 2 != 0) {
//                System.out.println(number);
//            }
//        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentences = phrase.split(" \\. ");
        System.out.println(Arrays.toString(sentences));




    }

}
