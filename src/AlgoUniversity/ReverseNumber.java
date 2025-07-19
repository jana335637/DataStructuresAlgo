package AlgoUniversity;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while(n>0){
            int in = scanner.nextInt();
            int reverse = 0;
            while(in > 0 ){
                reverse = reverse*10 + in%10;
                in/=10;
            }
            System.out.println(reverse);
            n--;
        }
    }
}
