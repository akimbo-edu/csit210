import java.util.Scanner;

public class Calories {

    private static final int cookiesPerBag = 40;
    private static final int servingsPerBag = 10;
    private static final int caloriesPerServing = 300;

    private static final double servingsPerCookie = (double) servingsPerBag / cookiesPerBag;
    private static final double caloriesPerCookie = (double) servingsPerCookie * caloriesPerServing;
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input cookies eaten:");
        
        int cookiesEaten = scanner.nextInt();
        double caloriesConsumed = cookiesEaten * caloriesPerCookie;
        System.out.println(caloriesConsumed);
        
        scanner.close();
    }

}
    