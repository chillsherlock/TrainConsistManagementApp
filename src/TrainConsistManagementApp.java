// ===================== UC15 =====================
// Cargo Safety using Runtime Exception

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape, String cargo) {
        this.shape = shape;
        this.cargo = cargo;
    }

    void validate() {
        if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
            throw new CargoSafetyException("Unsafe: Petroleum cannot be in Rectangular bogie");
        }
    }
}

public class UC15_CargoSafety {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC15: Cargo Safety Check ---");

        try {
            GoodsBogie b = new GoodsBogie("Rectangular", "Petroleum");
            b.validate();
            System.out.println("Cargo Assigned Safely");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Operation Completed");
        }

        System.out.println("Program Continues...");
    }
}