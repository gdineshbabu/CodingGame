import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int maxDepth = 0;
        int currentDepth = 0;
        for (int i = 0; i < n; i++) 
        {
            if (s.charAt(i) == '(')
            {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            }
            else if (s.charAt(i) == ')') 
            {
                currentDepth--;
            }
        }
        System.out.println(maxDepth);
    }
}
