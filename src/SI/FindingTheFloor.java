package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 8/26/2018.
 */
public class FindingTheFloor {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = in.nextInt();
        }
        mergeSort(array, 0, arraySize - 1);
        int queriesSize = in.nextInt();
        int[] queries = new int[queriesSize];
        for (int i = 0; i < queriesSize; i++) {
            queries[i] = in.nextInt();
        }
        for (int i = 0; i < queriesSize; i++) {
            int key = queries[i];
            if (key < array[0])
                System.out.println(Integer.MIN_VALUE);
            else
                System.out.println(MBS(array, 0, arraySize - 1, key));
        }
}

    private static int MBS(int[] array, int low, int high, int key) {
        int mid = low + (high - low) / 2;
        if (mid == (array.length - 1) || ((array[mid] <= key) && (mid + 1) < array.length && array[mid + 1] > key))
            return array[mid];
        if (array[mid] <= key)
            return MBS(array, mid + 1, high, key);
        return MBS(array, low, mid, key);
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
