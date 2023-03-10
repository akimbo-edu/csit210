import java.text.NumberFormat;

public class Variables {

    // Must use NumberFormat class

    private static final String CONTACT_NAME = "Johnny Appleseed";
    private static final int CONTACT_AGE = 25;
    private static final double ANNUAL_PAY = 100000000.0;

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String fmtPay = numberFormat.format(ANNUAL_PAY);

        System.out.println("My name is " + CONTACT_NAME +
                ", my age is " + CONTACT_AGE + " and I hope to earn " +
                fmtPay + " per year.");
    }

}
