package SI.Contest1;

import java.util.Scanner;

/**
 * Created by pillutja on 8/26/2018.
 */
public class EvenSplit {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            long x = in.nextLong();
            if(x==0 || x==2)
                System.out.println("No");
            else {
                if((x&1)==1)
                    System.out.println("No");
                else
                    System.out.println("Yes");
            }
        }
    }
}
