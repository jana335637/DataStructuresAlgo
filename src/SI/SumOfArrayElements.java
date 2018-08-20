package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 8/16/2018.
 */
public class SumOfArrayElements {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases=in.nextInt();
        for(int i=0;i<testCases;i++){
            printArraySum();
        }
    }

    private static void printArraySum() {
        int arraySize = in.nextInt();
        long[] array = new long[arraySize];
        long sum =0l;
        for (int i = 0; i < arraySize; i++) {
            array[i]=in.nextLong();
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
