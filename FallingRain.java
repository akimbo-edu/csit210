import java.util.Scanner;

public class FallingRain {

    private static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numYears = getYearCount(scanner);
        
        Double totalRainfall = 0.0;
        for (int year = 1; year <= numYears; year++) {
            System.out.printf("\nYear %d\n", year);
            for (int month = 1; month <= MONTHS_IN_YEAR; month++) {
                totalRainfall += getRainfall(scanner, month);
            }
        }

        Double averageRainfall = totalRainfall / (numYears * MONTHS_IN_YEAR);

        System.out.printf("""
                \nThe total rainfall for the %d year period was %,.2f inches.
                The average monthly rainfall for the period was %.2f inches.\n
                """, numYears, totalRainfall, averageRainfall);

        scanner.close();
    }

    private static int getYearCount(Scanner scanner) {
        String msg = "Number of years: ";
        int number;
        do {
            System.out.print(msg);
            while (!scanner.hasNextInt()) {
                System.out.print(msg);
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < 1);
        return number;
    }

    private static Double getRainfall(Scanner scanner, int month) {
        String msg = "Month " + month + " - Inches of rainfall: ";
        Double number;
        do {
            System.out.print(msg);
            while (!scanner.hasNextDouble()) {
                System.out.print(msg);
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (number < 0);
        return number;
    }

}
