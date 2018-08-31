package SI.SearchingAndSearching;

import java.util.Scanner;

/**
 * Created by pillutja on 8/22/2018.
 */
public class PairDifference
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println(getDifference());
        }
    }

    private static boolean getDifference() {
        int arraySize = in.nextInt();
        int difference = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i]=in.nextInt();
        }
        mergeSort(array,0,arraySize-1);
        int p1 = 0,p2=1;
        while(p2<arraySize){
            int diff = array[p2]-array[p1];
            if(diff==difference)
                return true;
            else if(diff>difference){
                if((p2-p1)==1)
                    p1=p2++;
                else
                    p1++;
            }
            else
                p2++;
        }
        return false;
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
