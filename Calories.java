import java.util.Scanner;

public class Calories {

    private static final int COOKIES_PER_BAG = 40;
    private static final int SERVINGS_PER_BAG = 10;
    private static final int CALORIES_PER_SERVING = 300;

    private static final double SERVINGS_PER_COOKIE = (double) SERVINGS_PER_BAG / COOKIES_PER_BAG;
    private static final double CALORIES_PER_COOKIE = (double) SERVINGS_PER_COOKIE * CALORIES_PER_SERVING;
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String msg = "Input cookies eaten: ";

        System.out.print(msg);
        while (!scanner.hasNextInt()) {
            System.out.print(msg);
            scanner.nextLine();
        }
    
        int cookiesEaten = scanner.nextInt();
        double caloriesConsumed = cookiesEaten * CALORIES_PER_COOKIE;
        System.out.println(String.format("You've consumed %,.2f calories.", caloriesConsumed));
        
        scanner.close();
    }

}
