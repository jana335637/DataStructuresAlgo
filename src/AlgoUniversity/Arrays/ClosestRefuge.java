package AlgoUniversity.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestRefuge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n], result = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        boolean found=false;
        int x=0, xprev=x+1;
        if(arr[x] != 1) {System.out.println(1); return;}

        x++;
        // 13
        //7 1 4 3 7 6 5 8 6 7 2 6 2
        //1 2 2 3 4 5 6 6 6 7 7 7 8 : 9
        // 7 1 4 3 7 9 5 8 10 7 2 6 2
        // 1 2 2 3 4 5 6 7 7 7 8 9 10

        while(x<n){
            if(arr[x] - arr[xprev] >1 ){
                found=true;
                System.out.println(arr[xprev]+1);
                return;
            }
            x++;
            xprev++;
        }
        if(!found) System.out.println(arr[n-1]+1);
    }
}
