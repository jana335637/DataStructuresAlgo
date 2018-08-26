package SI.Contest1;

import java.util.Scanner;

/**
 * Created by pillutja on 8/26/2018.
 */
public class PalindromeCheck {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int size = in.nextInt();
            String string = in.next();
            System.out.println(palindromeCheck(string,size));
        }
    }

    private static String palindromeCheck(String string, int size) {
        int mid=size/2;
        for (int i = 0; i <= mid; i++) {
            if((string.charAt(i)!=string.charAt(size-1-i)))
                return "No";
        }
        return "Yes";
    }
}
