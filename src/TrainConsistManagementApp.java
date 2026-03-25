// ===================== UC6 =====================
// Map Bogie to Capacity using HashMap

import java.util.HashMap;
import java.util.Map;

public class UC6_BogieCapacity {

        public static void main(String[] args) {

                System.out.println("=== Train Consist Management App ===");
                System.out.println("--- UC6: Bogie Capacity Mapping ---");

                // Create HashMap
                HashMap<String, Integer> bogieMap = new HashMap<>();

                // Add bogie-capacity pairs
                bogieMap.put("Sleeper", 72);
                bogieMap.put("AC Chair", 56);
                bogieMap.put("First Class", 24);

                // Display using entrySet
                for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
                        System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
                }
        }
}