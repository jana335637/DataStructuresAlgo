package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 8/15/2018.
 */
public class SwapBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases=in.nextInt();
        for (int i = 0; i < testCases; i++) {
            swapBits(in.nextInt());
        }
    }

    private static void swapBits(int number) {
        int[] binaryArray = new int[32];
        int index=0;
        while(number>0){
            binaryArray[index]=number%2;
            number/=2;
            index++;
        }
        if((index&1)==0)
            index++;
        System.out.println(formNumberFromBinary(swapAdjacentBits(binaryArray,index),index));
    }

    private static int[] swapAdjacentBits(int[] binaryArray,int index) {
        for (int i = index; i >= 1; i-=2) {
            binaryArray[i]+=binaryArray[i-1];
            binaryArray[i-1]=binaryArray[i]-binaryArray[i-1];
            binaryArray[i]=binaryArray[i]-binaryArray[i-1];
        }
        return binaryArray;
    }

    private static int formNumberFromBinary(int[] binaryArray, int index) {
        int number = 0;
        for (int i = 0; i <=index ; i++) {
            number+=((1<<i)*binaryArray[i]);
        }
        return number;
    }
}
