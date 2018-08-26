package SI.Sorting;

import java.util.Scanner;

/**
 * Created by pillutja on 8/26/2018.
 */
public class InsertionSortAdhoc {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            insertionSort();
        }
    }

    private static void insertionSort() {
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i]=in.nextInt();
        }
        for (int i = 1; i <arraySize ; i++) {
            int currentElement = array[i];
            int j=i-1;
            for (; j >=0 ; j--) {
                if(array[j]>currentElement){
                    array[j+1]=array[j];
                }
                else
                    break;
            }
            array[j+1]=currentElement;
            System.out.print((j+1)+" ");
        }
        System.out.println();
    }
}
