package SI;

import java.util.Scanner;

public class SumofSubArrays {
    static Scanner in = new Scanner(System.in);
    static int ans = 0;

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        long[] sum = new long[n];
        sum[0]=a[0];
        for (int i = 1; i < n; i++) {
            sum[i]=sum[i-1]+a[i];
        }
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            sumOfSubArryas(sum);
        }
    }

    static public void sumOfSubArryas(long[] sum) {
        int i=in.nextInt(),j=in.nextInt();
        if(i==0)
            System.out.println(sum[j]);
        else{
            System.out.println(sum[j]-sum[i-1]);
        }
    }

}
