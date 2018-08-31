package SI.SearchingAndSearching;

import java.util.Scanner;

/**
 * Created by pillutja on 8/31/2018.
 */
public class MaximumContiguousSubsequence {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = in.nextInt();
            int[] array = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                array[j] = in.nextInt();
            }
            mergeSort(array, 0, arraySize - 1);
            System.out.println(maximumContiguousSubsequence(array));
        }
    }

    private static int maximumContiguousSubsequence(int[] array) {
        int maxCount=0,count=0;
        for (int i = 1; i < array.length; i++) {
            if((array[i]-array[i-1])==1){
                count++;
            }
            else
            {
                if(maxCount!=count  || i==array.length-1){
                    maxCount=(maxCount>count)?maxCount:count;
                }
                count=0;
            }
            if(i==array.length-1) {
                if (maxCount != count ) {
                    maxCount = (maxCount > count) ? maxCount : count;
                }
            }
        }
        return maxCount+1;
    }


    private static void mergeSort(int[] array, int low, int high) {
        int mid = low + (high - low) / 2;
        if (low == high)
            return;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }

        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= high) {
            temp[k++] = array[j++];
        }
        for (int l = low; l <= high; l++) {
            array[l] = temp[l - low];
        }
    }
}
