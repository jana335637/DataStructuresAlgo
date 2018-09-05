package SI.Contest1;

import java.util.Scanner;

/**
 * Created by pillutja on 8/28/2018.
 */
public class SumAndXor {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            long n =in.nextLong();
            long clearBitCount=0;
            while (n>0){
                int temp = (int)(n&1);
                if(temp==0)
                    clearBitCount++;
                n=n>>1;
            }
            System.out.println((long)(Math.pow(2,clearBitCount)-1));
        }
    }
}
