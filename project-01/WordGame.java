import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = getInput(sc, "Name: ");
        String age = getInput(sc, "Age: ");
        String city = getInput(sc, "City: ");
        String college = getInput(sc, "College: ");
        String profession = getInput(sc, "Profession: ");
        String animal = getInput(sc, "Animal: ");
        String petName = getInput(sc, "Pet Name: ");

        sc.close();

        System.out.println(String.format(
                "There once was a person named %s who lived in a %s. At the age of %s, %s went to college at %s. %s graduated and went to work as a %s. Then, %s adopted a %s named %s. They both lived happily ever after!",
                name, city, age, name, college, name, profession, name, animal, petName));
    }

    private static String getInput(Scanner sc, String msg) {
        System.out.print(msg);
        String nextLine = sc.nextLine();
        while (nextLine.isEmpty()) {
            System.out.print(msg);
            nextLine = sc.nextLine();
        }
        return nextLine;
    }
}
