package AlgoUniversity.BS;

import java.util.Scanner;

public class SqrtOfX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double l=0.0, r=Math.max(n, 1.0), e = 1/1000000.0;
        while(l+e < r){
            double m  = l+(r-l)/2;
            if(pred(m, n)==0){
                l=m;
            } else{
                r=m;
            }
        }
        System.out.println(l);
    }

    private static int pred(double m, double n) {
        if(m*m <= n){
            return 0;
        }
        return 1;
    }
}
