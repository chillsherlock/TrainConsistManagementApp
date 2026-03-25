// ===================== UC4 =====================
// Maintain Ordered Train Consist using LinkedList

import java.util.LinkedList;

public class UC4_TrainOrder {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC4: Ordered Train Consist ---");

        // Create LinkedList
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry Car at position 2
        train.add(2, "Pantry Car");

        // Display after insertion
        System.out.println("After adding Pantry Car: " + train);

        // Remove first and last
        train.removeFirst();
        train.removeLast();

        // Final train consist
        System.out.println("Final Train Consist: " + train);
    }
}