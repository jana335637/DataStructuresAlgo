package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 8/15/2018.
 */
public class APowerB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases=in.nextInt();
        for (int i = 0; i < testCases ; i++) {
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            pow(a,b);
        }
    }

    private static void pow(int a, int b) {
        long ans=1l;
        long x=a;
        while(b!=0){
            if((b&1)==1)
                ans = (ans*x)%1000000007;
            b=b>>1;
            x =  ((x*x)%(1000000007));
        }
        System.out.println(ans);
    }
}
