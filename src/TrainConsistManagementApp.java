// ===================== UC16 =====================
// Bubble Sort for Bogie Capacities

public class UC16_BubbleSort {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC16: Bubble Sort ---");

        // Array of capacities
        int[] capacities = {72, 56, 24, 80, 40};

        // Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.print("Sorted Capacities: ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}