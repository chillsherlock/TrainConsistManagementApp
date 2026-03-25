// ===================== UC7 =====================
// Sort Bogies by Capacity using Comparator

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class
class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
                this.name = name;
                this.capacity = capacity;
        }
}

public class UC7_SortBogies {

        public static void main(String[] args) {

                System.out.println("=== Train Consist Management App ===");
                System.out.println("--- UC7: Sort Bogies by Capacity ---");

                // Create list
                List<Bogie> bogies = new ArrayList<>();

                // Add bogies
                bogies.add(new Bogie("Sleeper", 72));
                bogies.add(new Bogie("AC Chair", 56));
                bogies.add(new Bogie("First Class", 24));

                // Sort using Comparator (ascending)
                bogies.sort(Comparator.comparingInt(b -> b.capacity));

                // Display sorted bogies
                for (Bogie b : bogies) {
                        System.out.println(b.name + " -> " + b.capacity);
                }
        }
}