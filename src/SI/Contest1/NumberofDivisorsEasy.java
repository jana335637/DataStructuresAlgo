package SI.Contest1;

import java.util.Scanner;

/**
 * Created by pillutja on 8/26/2018.
 */
public class NumberofDivisorsEasy {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            long value = in.nextLong();
            int count=0;
            double mantissa =Math.sqrt(value)-(int)Math.sqrt(value);
            for (int j = 1; j <= Math.sqrt(value); j++) {
                if(value%j==0)
                    count++;
            }
            System.out.println((mantissa>0)?(count*2):(count*2-1));
        }
    }
}
