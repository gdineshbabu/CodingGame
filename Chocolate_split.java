import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the chocolate bar
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Calculate the minimum number of splits
        int minSplits = (M - 1) + (N - 1) + ((M-1) * (N - 1));

        // Output the result
        System.out.println(minSplits);
    }
}
