import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        String magnitude = sc.next();
        int multiplier = 1;
        switch (magnitude) {
            case "hundred":
                multiplier = 100;
                break;
            case "thousand":
                multiplier = 1000;
                break;
            case "million":
                multiplier = 1000000;
                break;
        }
        int result = (int) (num * multiplier);
        System.out.println(result);
    }
}
