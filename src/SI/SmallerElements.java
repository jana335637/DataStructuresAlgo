package SI;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by pillutja on 8/31/2018.
 */
public class SmallerElements {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int arraySize = in.nextInt();
            int[] array = new int[arraySize];
            int[] indices = new int[arraySize];
            int count=0;
            boolean zeroEncountered = false;
            for (int j = 0; j < arraySize; j++) {
                array[j] = in.nextInt();
            }
            for (int j = 0; j < arraySize; j++) {
                indices[j]=j;
            }
            CustomizedMergeSort(array,indices,0,arraySize-1);
            int j = 0;
            for (; j <= (arraySize - 1)/2; j++) {
                if(indices[j]==0)
                    zeroEncountered=true;
                else
                {
                    int diff =(indices[j]-j);
                    count+=((diff<0)?(diff*-1):diff);
                }
            }
            if(zeroEncountered){
                int diff =(indices[j]-j);
                count+=((diff<0)?(diff*-1):diff);
            }
            System.out.println(count);
        }
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
}
