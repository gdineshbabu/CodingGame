import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine(); // consume the newline character
        String[] t = input.nextLine().split(" ");
        boolean[] present = new boolean[n];
        for (String s : t) {
            int x = Integer.parseInt(s) - 1;
            present[x] = true;
        }
        for (int i = 0; i < n; i++) {
            if (present[i]) {
                System.out.println((i + 1) + " is here");
            } else {
                System.out.println((i + 1) + " is absent");
            }
        }
    }
}
