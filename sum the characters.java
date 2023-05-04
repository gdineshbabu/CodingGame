import java.util.*;
public class Solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int hexValue = Character.digit(c, 16);
            sum += hexValue;
        }
        System.out.println(sum);
    }
}
