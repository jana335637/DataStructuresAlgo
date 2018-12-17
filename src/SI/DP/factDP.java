package SI.DP;

import javafx.util.Pair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class factDP {

    static Scanner in = new Scanner(System.in);
    static long[] fact;
    static long rem = 1000000007;
    public static void main(String[] args) throws IOException {
        int testCases =in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n =in.nextInt();
            fact= new long[n+1];
            fact[0]=fact[1]=1;
            System.out.println(fact(n));
        }
    }
    private static long fact(int n) {
        if(n<=1)
            return 1;
        fact[n]=(n*fact(n-1))%(rem);
        return fact[n];
    }
}
