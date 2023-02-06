import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Budget {

    private String name;
    private double startBal;
    private Map<String, Double> expenses;

    public Budget(String name, double startBal) {
        this.name = name;
        this.startBal = startBal;
        this.expenses = new HashMap<>();
    }

    public void addEntry(String name, double cost) {
        this.expenses.put(name, cost);
    }

    @Override
    public String toString() {
        String out = this.name + "\nMonthly Budget\n\n";
        out += String.format("Starting Balance: $%.2f\n\n", this.startBal);
        double remainingBal = this.startBal;
        for (var entry : this.expenses.entrySet()) {
            out += String.format("%s: -$%.2f\n", entry.getKey(), entry.getValue());
            remainingBal -= entry.getValue();
            out += String.format("Remaining Balance: $%.2f\n\n", remainingBal);
        }
        out += String.format("Final Balance: $%.2f", remainingBal);
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = getString(sc, "Name: ");
        double startBal = getDouble(sc, "Starting Balance: ");
        Budget budget = new Budget(name, startBal);

        for (int i = 0; i < 3; i ++) {
            String entry = getString(sc, "Entry Name: ");
            Double cost = getDouble(sc, "Cost: ");
            budget.addEntry(entry, cost);
        }

        System.out.println("\n" + budget);

        sc.close();
    }

    private static String getString(Scanner sc, String msg) {
        String input = "";
        while (input.isEmpty()) {
            System.out.print(msg);
            input = sc.nextLine();
        }
        return input;
    }

    private static double getDouble(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextDouble()) {
            System.out.print(msg);
            sc.next();
        }
        return sc.nextDouble();
    }
}
