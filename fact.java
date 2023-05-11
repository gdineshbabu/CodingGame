

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long factorial = 1;
        long sign = 1;
        for (long i = n; i >= 1; i -= 2) {
            factorial *= i;
            sign *= -1;
        }
        factorial *= sign;
        long a=Math.abs(factorial);
        System.out.println(a);
    }
}
