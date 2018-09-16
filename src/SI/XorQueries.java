package SI;

import java.util.Scanner;

public class XorQueries {
    public static void main(String[] args) {
        /*System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);*/
     Scanner in = new Scanner(System.in);
    int n= in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();
        }
    }
    static long solve(int x,int l,int r){
        int xMSB=(int)(Math.log(x)/Math.log(2)),rMSB = (int)(Math.log(r)/Math.log(2));
        long max=Integer.MIN_VALUE;
        if(rMSB>xMSB){
            int end = ((1<<rMSB)>l)?(1<<rMSB):(l);
            for (int j = r; j >= end ; j--) {
                if(max<(x^j))
                    max=x^j;
            }
        }
        else{
            for (int j = r; j >= l ; j--) {
                if(max<(x^j))
                    max=x^j;
            }
        }
        return max;
    }
}
