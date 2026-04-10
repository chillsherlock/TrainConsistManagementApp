// ===================== UC17 =====================
// Sorting using Arrays.sort()

import java.util.Arrays;

public class UC17_ArraysSort {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC17: Built-in Sorting ---");

        // Array of bogie types
        String[] bogies = {"Sleeper", "AC", "General", "ChairCar", "Luxury"};

        // Sorting
        Arrays.sort(bogies);

        // Display
        System.out.println("Sorted Bogie Types: " + Arrays.toString(bogies));
    }
}