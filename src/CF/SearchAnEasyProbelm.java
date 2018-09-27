package CF;

import java.util.Scanner;

/**
 * Created by pillutja on 8/24/2018.
 */
public class SearchAnEasyProbelm {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(searchEasyProblem());
    }

    private static String searchEasyProblem() {
        int n = in.nextInt();
        int[] poll = new int[n];
        for (int i = 0; i < n; i++) {
            poll[i]=in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(poll[i]==1)
                return "HARD";
        }
        return "EASY";
    }
}
