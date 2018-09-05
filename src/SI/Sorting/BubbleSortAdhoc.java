package SI.Sorting;

import java.util.Scanner;

/**
 * Created by pillutja on 8/30/2018.
 */
public class BubbleSortAdhoc {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = in.nextInt();
            int[] array = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                array[j]=in.nextInt();
            }
            bubbleSort(array);
        }
    }

    private static void bubbleSort(int[] array) {
        int swapCount=0;
        boolean swapped=false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]){
                    swapped=true;
                    swapCount++;
                    array[j]=array[j+1]^array[j]^(array[j+1]=array[j]);
                }
            }
            if(swapped==false)
                break;
        }
        System.out.println(swapCount);
    }
}
