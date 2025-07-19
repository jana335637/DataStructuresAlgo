package AUDevDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestEvenNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*long num = scanner.nextLong();

        while(num > 0 ){
            if (num % 2 == 0) {
                System.out.println(num);
                break;
            }
            num/=10;
        }*/
        int t = scanner.nextInt();
        long[] arr = new long[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextLong();
        }
        for (int i = 0; i < t; i++) {
            long n  = arr[i], n1=arr[i];
            double ans = n;
            List<Long> digits = new ArrayList<>();
            while(n1 > 0 ){
                long digit = n1 % 10;
                n1 /= 10;
                if(digit > 0)
                    digits.add(digit);
            }
            List<Long> nonDivisible = new ArrayList<>();
            for(Long digit : digits){
                if(n%digit != 0){
                    nonDivisible.add(digit);
                }
            }
            System.out.println(nonDivisible);
            for(Long digit : nonDivisible){
                ans = digit * Math.ceil(n/digit);
                n=Long.parseLong(String.valueOf(ans));
            }
            System.out.println(ans);
        }
    }
}
