import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] temps = new int[4];
            for (int j = 0; j < 4; j++) {
                temps[j] = sc.nextInt();
            }
            Arrays.sort(temps);
            System.out.println(temps[2]);
        }
    }
}
