import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input =sc.nextLine();
        String output = replaceWithCount(input);
        System.out.println(output);
    }

    public static String replaceWithCount(String input) {
        StringBuilder output = new StringBuilder();
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            char lowercaseC = Character.toLowerCase(c);
            int count = countMap.getOrDefault(lowercaseC, 0) + 1;
            countMap.put(lowercaseC, count);
            output.append(count);
        }

        return output.toString();
    }
}
