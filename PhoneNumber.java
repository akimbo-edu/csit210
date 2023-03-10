public class PhoneNumber {

    public static void main(String[] args) {
        String n, phoneNumber = "";

        do {
            n = genNumbers(3);
        } while (n.contains("8") || n.contains("9"));
        phoneNumber += n + "-";
        do {
            n = genNumbers(3);
        } while (Integer.parseInt(n) > 742);
        phoneNumber += n + "-" + genNumbers(4);

        System.out.println(phoneNumber);
    }

    private static String genNumbers(int count) {
        String numString = "";
        for (int i = 0; i < count; i++) {
            numString += (int) (Math.random() * 10);
        }
        return numString;
    }
    
}
