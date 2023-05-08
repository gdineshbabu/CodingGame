import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String prefix = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline character after integer input
        List<String> questions = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            questions.add(sc.nextLine());
        }
        List<String> matchingQuestions = getMatchingQuestions(prefix, questions);
        if (matchingQuestions.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (String question : matchingQuestions) {
                System.out.println(question);
            }
        }
    }

    public static List<String> getMatchingQuestions(String prefix, List<String> questions) {
        List<String> matchingQuestions = new ArrayList<String>();
        for (String question : questions) {
            if (question.startsWith(prefix)) {
                matchingQuestions.add(question);
            }
        }
        return matchingQuestions;
    }
}
