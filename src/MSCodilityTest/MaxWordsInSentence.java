package MSCodilityTest;

import java.util.HashSet;
import java.util.Set;

public class MaxWordsInSentence {
    public static int solution(String S) {
        // Implement your solution here
        Set<String> words = new HashSet<>();
        String[] dotSplitted = S.split(".");
        for (int i = 0; i < dotSplitted.length; i++) {
            System.out.println(dotSplitted[i]);
            String[] questionMarkSplitted = dotSplitted[i].split("?");
            for (int j = 0; j < questionMarkSplitted.length; j++) {
                System.out.println(questionMarkSplitted[i]);
                String[] exclamatorySplits = questionMarkSplitted[j].split("!");
                for (int k = 0; k < exclamatorySplits.length; k++) {
                    System.out.println(exclamatorySplits[i]);
                    words.add(exclamatorySplits[k]);
                }
            }
        }
        System.out.println("*******FinalWords******");
        System.out.println(words);
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(solution("Forget  CVs..Save time . x x"));
    }

}
