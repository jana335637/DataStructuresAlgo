package SI.Contest1;

import java.util.Scanner;

/**
 * Created by pillutja on 8/26/2018.
 */
public class AddReversedNumbers {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            long n = in.nextLong();
            long n1 = in.nextLong();
            System.out.println(reversal(n)+reversal(n1));
        }
}

    private static long reversal(long n) {
        long reverse=0l;
        while (n>0)
        {
            reverse= (reverse*10)+(n%10);
            n/=10;
        }
        return reverse;
    }
}
