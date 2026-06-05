package ArrayInfosysQues;

import java.util.HashMap;
import java.util.Map;

public class DuplicateFrequency {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 40, 20, 50, 10};

        System.out.println("Elements appearing 2 or more times:");
        printDuplicatesWithMap(numbers);
    }

    public static void printDuplicatesWithMap(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the map and print keys with a value >= 2
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey() + " (appears " + entry.getValue() + " times)");
            }
        }
    }
}
