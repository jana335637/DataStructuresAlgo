package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 9/6/2018.
 */
public class AreaCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), k = in.nextLong();
        long total = (long)Math.ceil((2*n-1)/2);
        System.out.println(total+",2n-1:"+(2*n-1)+"/2: "+(2*n-1)/2);
        System.out.println((long)Math.ceil(k/n));
        System.out.println(Math.ceil(999999999999999998.2));
        System.out.println(Math.ceil(9.8999999999E21));
        System.out.println(Double.MAX_VALUE);
        System.out.println(k/n);
    }
}
