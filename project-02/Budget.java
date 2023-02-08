import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Budget {

    /*
     * Budget object fields and methods
     */
    private static final String ENTRY_TEMPLATE = """
            %s: -$%.2f
            Remaining Balance: $%.2f\n
            """;
    private static final String STRING_TEMPLATE = """
            %s
            Monthly Budget\n
            Starting Balance: $%.2f\n
            %sFinal Balance: $%.2f
            """;

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
        String entries = "";

        double remainingBal = this.startBal;
        for (var entry : this.expenses.entrySet()) {
            String k = entry.getKey();
            double v = entry.getValue();
            remainingBal -= entry.getValue();
            entries += String.format(ENTRY_TEMPLATE, k, v, remainingBal);
        }

        return String.format(STRING_TEMPLATE,
                this.name, this.startBal, entries, remainingBal);
    }

    /*
     * Main class methods
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = getString(sc, "Name: ");
        double startBal = getDouble(sc, "Starting Balance: ");
        Budget budget = new Budget(name, startBal);

        for (int i = 0; i < 3; i++) {
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
            System.out.println(msg);
            input = sc.nextLine();
        }
        return input;
    }

    private static double getDouble(Scanner sc, String msg) {
        System.out.println(msg);
        while (!sc.hasNextDouble()) {
            System.out.println(msg);
            sc.next();
        }
        return sc.nextDouble();
    }
}
