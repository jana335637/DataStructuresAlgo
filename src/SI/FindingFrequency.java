package SI;

import java.util.Scanner;

public class FindingFrequency {
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
            System.out.println("Higher: "+getHigherIndexMBS(array, 0, arraySize - 1, key)+",Lower:"+getLowerIndexMBS(array, 0, arraySize - 1, key));
            System.out.println(getHigherIndexMBS(array, 0, arraySize - 1, key) - getLowerIndexMBS(array, 0, arraySize - 1, key) + 1);
        }
    }

    private static int getLowerIndexMBS(int[] array, int low, int high, int key) {
        if (low == high)
            return -2;
        int mid = low + (high - low + 1) / 2;
        if (mid == 0 || ((array[mid] == key) && (mid - 1) >= 0 && array[mid - 1] < key))
            return mid;
        if (array[mid] >= key)
            return getLowerIndexMBS(array, low, mid - 1, key);
        return getLowerIndexMBS(array, mid, high, key);
    }

    private static int getHigherIndexMBS(int[] array, int low, int high, int key) {
        int mid = low + (high - low) / 2;
        if(low==high)
            return 1;
        if(mid == (array.length - 1) || ((array[mid] == key) && (mid + 1) < array.length && array[mid + 1] > key))
            return mid;
        if(array[mid] <= key)
            return getHigherIndexMBS(array, mid + 1, high, key);
        return getHigherIndexMBS(array, low, mid, key);
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
