// ===================== UC18 =====================
// Linear Search for Bogie ID

import java.util.Scanner;

public class UC18_LinearSearch {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC18: Linear Search ---");

        // Array of bogie IDs
        String[] bogieIds = {"B101", "B205", "B309", "B450", "B512"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break; // early termination
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }

        sc.close();
    }
}