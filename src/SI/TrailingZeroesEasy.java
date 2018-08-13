package SI;

import java.util.Scanner;

public class TrailingZeroesEasy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            long x = in.nextLong();
            int count =0;
            for (long k = 5; x/k >= 1 ; k*=5) {
                count+=(x/k);
            }
            System.out.println(count);
        }
    }
}
