// ===================== UC20 =====================
// Prevent Search on Empty Train

import java.util.ArrayList;
import java.util.List;

public class UC20_DefensiveCheck {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC20: Empty State Validation ---");

        // Train bogie list (EMPTY)
        List<String> bogies = new ArrayList<>();

        // Attempt search
        try {
            searchBogie(bogies, "B101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program Continues...");
    }

    // Search method
    public static void searchBogie(List<String> bogies, String key) {

        // 🔴 Defensive check
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Cannot search: No bogies in the train");
        }

        // Search logic (only runs if list is NOT empty)
        boolean found = false;

        for (String b : bogies) {
            if (b.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}