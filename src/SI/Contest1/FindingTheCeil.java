package SI.Contest1;

import java.util.Scanner;

/**
 * Created by pillutja on 8/26/2018.
 */
public class FindingTheCeil {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int arraySize = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = in.nextInt();
        }
        mergeSort(array,0,arraySize-1);
        int queriesSize = in.nextInt();
        int[] queries = new int[queriesSize];
        int[] indices = new int[queriesSize];
        for (int i = 0; i < queriesSize; i++) {
            indices[i]=i;
        }
        queriesSort(queries,indices,0,queriesSize-1);
        for (int i = 0; i < queriesSize; i++) {
            System.out.print(queries[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < queriesSize; i++) {
            System.out.print(indices[i]+" ");
        }
        int i=0,j=0;
        while(j<queriesSize && i<arraySize){
            if(queries[j]<=array[i])
                i++;
            else{
                if(i==0)
                    queries[j]=array[i];
                else
                    queries[j]=array[i-1];
                j++;
            }
        }
        while (j<queriesSize){
            queries[j]=Integer.MAX_VALUE;
            j++;
        }
        queriesSort(indices,queries,0,queriesSize-1);
        for (int k = 0; k < indices.length; k++) {
            System.out.println(queries[k]);
        }
    }
    private static void queriesSort(int[] array,int[] indices,int low,int high) {
        int mid= low+(high-low)/2;
        if(low==high)
            return ;
        queriesSort(array,indices,low,mid);
        queriesSort(array,indices,mid+1,high);
        queriesmerge(array,indices,low,mid,high);
    }

    private static void queriesmerge(int[] array,int[] indices, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int[] temp1 = new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high)
        {
            if(array[i]<array[j])
            {
                temp1[k]=indices[i];
                temp[k++]=array[i++];
            }
            else
            {
                temp1[k]=indices[j];
                temp[k++]=array[j++];
            }

        }
        while(i<=mid){
            temp1[k]=indices[i];
            temp[k++]=array[i++];
        }
        while(j<=high) {
            temp1[k]=indices[j];
            temp[k++]=array[j++];
        }
        for (int l = low; l <= high; l++) {
            array[l]=temp[l-low];
            indices[l] = temp1[l-low];
        }
    }
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
