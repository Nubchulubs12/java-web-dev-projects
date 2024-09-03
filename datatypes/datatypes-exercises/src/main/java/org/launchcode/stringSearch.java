package org.launchcode;
import java.util.Scanner;
public class stringSearch {
    public static void main(String[] args){
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use " +
                "of a book,’ thought Alice ‘without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term to search for.");

        String search = input.nextLine();

        String toLowerCase = alice.toLowerCase();
        String toLowerCaseSearch = search.toLowerCase();

        boolean found = toLowerCase.contains(toLowerCaseSearch);

//        System.out.println("Search term found: " + found);
        Integer index = alice.indexOf(search);
        Integer length = search.length();
        System.out.println("your search term first appears at index: " + index + " and your term is " + length + " characters long.");

        String modifiedSentence = alice.replace(search, "");
        System.out.println(modifiedSentence);


    }
}
