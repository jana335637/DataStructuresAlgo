package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 8/24/2018.
 */
public class TripletWithK {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println(getTripletExistence());
        }
    }

    private static boolean getTripletExistence() {
        int arraySize = in.nextInt();
        int sum = in.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i]=in.nextInt();
        }
        mergeSort(array,0,arraySize-1);
        for (int i = 0; i < arraySize; i++) {
            int sum1 = sum-array[i];
            int p1 = 0,p2=arraySize-1;
            while(p1<p2)
            {
                if(p1==i)
                    p1++;
                if(p2==i)
                    p2--;
                int sum2 =array[p1]+array[p2];
                if(sum1==sum2)
                    return true;
                else if(sum2>sum1)
                    p2--;
                else
                    p1++;
                if(p1==(i+1))
                    p1++;
                if(p2==(i+1))
                    p2--;
            }
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
