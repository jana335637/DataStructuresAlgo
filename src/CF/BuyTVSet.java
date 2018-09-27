package CF;

import java.util.Scanner;

public class BuyTVSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong(),b=in.nextLong(),x=in.nextLong(),y=in.nextLong();
        long gcd = ((x<=y)?(gcd(y,x)):gcd(x,y)),count=0l,multiplier=2;
        x/=gcd;
        y/=gcd;
        long x1 = a/x,y1=b/y;
        System.out.println((x1>y1)?y1:x1);
    }

    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
