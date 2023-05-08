import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] samples = new int[n];
        for (int i = 0; i < n; i++) {
            samples[i] = scanner.nextInt();
        }

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ":");
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (samples[j] == i) {
                    count++;
                }
            }
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
