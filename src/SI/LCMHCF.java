package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 8/16/2018.
 */
public class LCMHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            printLCMHCF(a, b);
        }
    }

    private static void printLCMHCF(int a, int b) {
        int hcf = getHCF(a,b);
        long lcm = (a*1l*b)/hcf;
        System.out.println(lcm +" "+hcf);
    }

    private static int getHCF(int a, int b) {
        if(a==b)
            return a;
        else if(a==0){
            return b;
        }
        else
        {
            if(a>b)
                return getHCF(a%b,b);
            else
                return getHCF(b%a,a);
        }
    }
}
