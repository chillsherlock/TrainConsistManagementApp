// ===================== UC8 =====================
// Filter Bogies using Stream API

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
                this.name = name;
                this.capacity = capacity;
        }
}

public class UC8_FilterBogies {

        public static void main(String[] args) {

                System.out.println("=== Train Consist Management App ===");
                System.out.println("--- UC8: Filter Bogies by Capacity (>60) ---");

                // Create list
                List<Bogie> bogies = new ArrayList<>();
                bogies.add(new Bogie("Sleeper", 72));
                bogies.add(new Bogie("AC Chair", 56));
                bogies.add(new Bogie("First Class", 24));

                // Stream filter
                List<Bogie> filtered = bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

                // Display result
                for (Bogie b : filtered) {
                        System.out.println(b.name + " -> " + b.capacity);
                }
        }
}