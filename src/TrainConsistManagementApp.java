// ===================== UC9 =====================
// Group Bogies using groupingBy()

import java.util.*;
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

public class UC9_GroupBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC9: Group Bogies ---");

        // Create list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Group by capacity category
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(
                        b -> (b.capacity > 50) ? "High Capacity" : "Low Capacity"
                ));

        // Display grouped result
        for (String key : grouped.keySet()) {
            System.out.println(key + ":");
            for (Bogie b : grouped.get(key)) {
                System.out.println("  " + b.name + " -> " + b.capacity);
            }
        }
    }
}