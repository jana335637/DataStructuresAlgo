package SI.SearchingAndSearching;

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
        int[] indices = new int[queriesSize];
        for (int i = 0; i < queriesSize; i++) {
            queries[i] = in.nextInt();
        }
        for (int i = 0; i < queriesSize; i++) {
            indices[i]=i;
        }
        CustomizedMergeSort(queries,indices, 0, queriesSize - 1);
        /* TLE
        for (int i = 0; i < queriesSize; i++) {
            int key = queries[i];
            System.out.println(getHigherIndexMBS(array, 0, arraySize - 1, key) - getLowerIndexMBS(array, 0, arraySize - 1, key) + 1);
        }*/
        int p1=0,p2=array.length-1,p3=0,k=0;
        while(p3<=queriesSize-1)
        {
            int higherIndex=getHigherIndexMBS(array, p1,p2, queries[p3]);
            int result = higherIndex -getLowerIndexMBS(array, p1,p2, queries[p3]) + 1;
            queries[k++]=result;
            if(result!=0)
                p1=higherIndex;
            p3++;
        }
        CustomizedMergeSort(indices,queries,0, queriesSize-1);
        for (int i = 0; i < queriesSize; i++) {
            System.out.println(queries[i]);
        }
    }

    private static int getLowerIndexMBS(int[] array, int low, int high, int key) {
        if((low==high)&&(array[low]!=key))
            return 2;
        int mid = low + (high - low + 1) / 2;
        if (mid == 0 || ((array[mid] == key) && (mid - 1) >= 0 && array[mid - 1] < key))
            return mid;
        if (array[mid] >= key)
            return getLowerIndexMBS(array, low, mid - 1, key);
        return getLowerIndexMBS(array, mid, high, key);
    }

    private static int getHigherIndexMBS(int[] array, int low, int high, int key) {
        int mid = low + (high - low) / 2;
        if((low==high)&&(array[low]!=key))
            return 1;
        if(mid == (array.length - 1) || ((array[mid] == key) && (mid + 1) < array.length && array[mid + 1] > key))
            return mid;
        if(array[mid] <= key)
            return getHigherIndexMBS(array, mid + 1, high, key);
        return getHigherIndexMBS(array, low, mid, key);
    }
    private static void CustomizedMergeSort(int[] array,int[] array1, int low, int high) {
        int mid = low + (high - low) / 2;
        if (low == high)
            return;
        CustomizedMergeSort(array,array1, low, mid);
        CustomizedMergeSort(array,array1, mid + 1, high);
        CustomizedMerge(array,array1, low, mid, high);
    }

    private static void CustomizedMerge(int[] array,int[] array1, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int[] temp1 = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                temp1[k]=array1[i];
                temp[k++] = array[i++];
            } else {temp1[k]=array[i];
                temp1[k]=array1[j];
                temp[k++] = array[j++];
            }

        }
        while (i <= mid) {
            temp1[k]=array1[i];
            temp[k++] = array[i++];
        }
        while (j <= high) {
            temp1[k]=array1[j];
            temp[k++] = array[j++];
        }
        for (int l = low; l <= high; l++) {
            array1[l]=temp1[l-low];
            array[l] = temp[l - low];
        }
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
