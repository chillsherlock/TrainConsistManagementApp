// ===================== UC10 =====================
// Aggregate Capacity using Stream reduce()

import java.util.ArrayList;
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

public class UC10_TotalCapacity {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC10: Total Seating Capacity ---");

        // Create list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Stream aggregation
        int total = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display total
        System.out.println("Total Seating Capacity: " + total);
    }
}