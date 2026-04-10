// ===================== UC11 =====================
// Validate Train ID and Cargo Code using Regex

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC11_RegexValidation {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC11: Regex Validation ---");

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Matcher
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validation
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        sc.close();
    }
}