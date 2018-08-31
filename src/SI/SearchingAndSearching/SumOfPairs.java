package SI.SearchingAndSearching;

import java.util.Scanner;

/**
 * Created by pillutja on 8/31/2018.
 */
public class SumOfPairs {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = in.nextInt();
            int key = in.nextInt();
            int[] array = new int[arraySize];
            for (int j = 0; j < arraySize; j++) {
                array[j] = in.nextInt();
            }
            mergeSort(array, 0, arraySize - 1);
            System.out.println(getSumOfPairs(array, key));
        }
    }
    private static String getSumOfPairs(int[] array, int key) {
        int p1=0,p2=array.length-1;
        while(p1<p2){
            int sum = array[p1]+array[p2];
            if(sum==key)
                return "True";
            else if(sum>key)
                p2--;
            else
                p1++;
        }
        return "False";
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