/*
package SI.Searching;

import java.util.Scanner;

*/
/**
 * Created by pillutja on 8/26/2018.
 *//*

public class FindingFrequency {
    public static void main(String[] args) {
            frequencySort();
    }

    private static void frequencySort() {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i]=in.nextInt();
        }
        mergeSort(array,0,arraySize-1);
        int queriesSize = in.nextInt();
        int[] queries = new int[queriesSize];
        for (int i = 0; i < queriesSize; i++) {
            queries[i]=in.nextInt();
            System.out.println(lastIndex(array,0,arraySize-1,queries[i])-firstIndex(array,0,arraySize-1,queries[i]));
        }

    }

*/
/*
    private static int firstIndex(int[] array, int low, int high, int key) {
        int mid= low+(high-low)/2;
        if(low>high)
            return -1;
    }
    private static int lastIndex(int[] array, int low, int high, int key) {
        int mid= low+(high-low)/2;
        if(low>high)
            return 1;
    }
*//*


    private static void mergeSort(int[] array,int low,int high) {
        int mid= low+(high-low)/2;
        if(low==high)
            return ;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high)
        {
            if(array[i]<array[j])
            {
                temp[k++]=array[i++];}
            else
            {
                temp[k++]=array[j++];
            }

        }
        while(i<=mid){
            temp[k++]=array[i++];
        }
        while(j<=high) {
            temp[k++]=array[j++];
        }
        for (int l = low; l <= high; l++) {
            array[l]=temp[l-low];
        }
    }
}
*/
