public class Variables {

    private static final String CONTACT_NAME = "Alexander Olenik";
    private static final int CONTACT_AGE = 19;
    private static final double ANNUAL_PAY = 100000000.0;

    public static void main(String[] args) {
        System.out.println(String.format(
            "My name is %s, my age is %d and I hope to earn $%,.1f per year.", 
            CONTACT_NAME, 
            CONTACT_AGE, 
            ANNUAL_PAY));
   
    }
    


}

