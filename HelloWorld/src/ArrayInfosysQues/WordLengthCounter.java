package ArrayInfosysQues;

import java.util.Scanner;

public class WordLengthCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Check if the user entered an empty string
        if (sentence.trim().isEmpty()) {
            System.out.println("No words entered.");
            scanner.close();
            return;
        }

        // Split the sentence into an array of words
        // "\\s+" is a regular expression that splits the string at one or more spaces
        String[] words = sentence.trim().split("\\s+");

        System.out.println("\nWord Character Counts:");
        System.out.println("----------------------");

        // Loop through the array to calculate and print the length of each word
        for (String word : words) {
            System.out.println(word + ": " + word.length());
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
