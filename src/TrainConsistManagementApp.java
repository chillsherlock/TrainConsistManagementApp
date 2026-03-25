// ===================== UC5 =====================
// Preserve Insertion Order using LinkedHashSet

import java.util.LinkedHashSet;

public class UC5_TrainFormation {

        public static void main(String[] args) {

                System.out.println("=== Train Consist Management App ===");
                System.out.println("--- UC5: Ordered Unique Bogies ---");

                // Create LinkedHashSet
                LinkedHashSet<String> train = new LinkedHashSet<>();

                // Add bogies
                train.add("Engine");
                train.add("Sleeper");
                train.add("Cargo");
                train.add("Guard");

                // Add duplicate
                train.add("Sleeper"); // ignored automatically

                // Display formation
                System.out.println("Final Train Formation: " + train);
        }
}