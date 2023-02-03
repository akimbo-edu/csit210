public class Variables {

    private static final String contactName = "Alexander Olenik";
    private static final int contactAge = 19;
    private static final double annualPay = 1000000000.0;

    public static void main(String[] args) {
        System.out.println(String.format("My name is %s, my age is %d and I hope to earn $%,.1f per year.", contactName, contactAge, annualPay));
    }
    
}
