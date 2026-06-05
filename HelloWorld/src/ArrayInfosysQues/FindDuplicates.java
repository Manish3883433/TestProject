package ArrayInfosysQues;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};

        System.out.println("Elements appearing 2 or more times:");
        printDuplicates(numbers);
    }

    public static void printDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            // The add() method returns false if the element is already in the set
            if (!seen.add(num)) {
                duplicates.add(num); // We use a second set to avoid printing an element multiple times
            }
        }

        // Print out the gathered duplicates
        for (int duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
