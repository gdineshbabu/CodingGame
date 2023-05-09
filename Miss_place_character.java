
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = scanner.nextLine();

        for (int i = 0; i < letters.length() - 1; i++) {
            char current = letters.charAt(i);
            char next = letters.charAt(i + 1);

            if (current > next) {
                System.out.println(next);
                break;
            }
        }
    }
}
