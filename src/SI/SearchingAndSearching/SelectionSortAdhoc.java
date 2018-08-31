package SI.SearchingAndSearching;

import java.util.Scanner;

/**
 * Created by pillutja on 8/30/2018.
 */
public class SelectionSortAdhoc {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = in.nextInt();
            int[] array = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                array[j]=in.nextInt();
            }
            selectionSort(array);
            System.out.println();
        }
    }

    private static void selectionSort(int[] array) {
        int maxIndex=array.length-1;
        for (int i = array.length-1; i >0; i--) {
            int maxElement=array[i];
            for (int j = i; j >=0; j--) {
                if (array[j] >= maxElement) {
                    maxElement=array[j];
                    maxIndex=j;
                }
            }
            System.out.print(maxIndex+" ");
            array[maxIndex]=array[i]^array[maxIndex]^(array[i]=array[maxIndex]);
        }
    }
}
