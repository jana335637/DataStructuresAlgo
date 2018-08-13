package SI;

import java.util.Scanner;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases=in.nextInt();
        for (int i = 0; i < testCases ; i++) {
            long number = in.nextLong();
            if(checkPowerOfTwo(number))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }

    private static boolean checkPowerOfTwo(long number) {
        int setBitCount = 0;
        if (number==0)
            return false;
        while(number>0)
        {
            if((number&1)==1)
                setBitCount++;
            if(setBitCount>1)
                return false;
            number=number>>1;
        }
        return true;
        }
}
