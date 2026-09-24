import java.util.Random;
import java.util.Scanner;

public class rng {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character key set: ");
        String keySet = sc.nextLine();

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        String randomValue = generateRandom(keySet, length);

        System.out.println("Random Number/String: " + randomValue);

        sc.close();
    }

    public static String generateRandom(String keySet, int length) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(keySet.length());
            result.append(keySet.charAt(index));
        }

        return result.toString();
    }
}
