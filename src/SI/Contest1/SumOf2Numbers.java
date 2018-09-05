package SI.Contest1;

import java.util.Scanner;

/**
 * Created by pillutja on 8/27/2018.
 */
public class SumOf2Numbers {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int size = in.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                array[j] = in.nextInt();
            }
            mergeSort(array,0,size-1);
            System.out.println(checkSum(array,array.length));
        }
    }

    private static String checkSum1(int[] array, int length) {
        long sum=0l;
        for (int i = 0; i < length; i++) {
            sum+=array[i];
        }
        if((sum&1)==1)
            return "No";
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(i!=j){
                    int sum1 = array[i]+array[j];
                    if(sum1==(int)(sum/2))
                        return "Yes";
                }

            }
        }
        return "No";
    }

    private static String checkSum(int[] array, int length) {
        int p1=0,p2=length-1;
        long sum=0l;
        for (int i = 0; i < length; i++) {
            sum+=array[i];
        }
        if((sum&1)==1)
            return "No";
        while (p1 < p2) {
            long sum1 = array[p1] + array[p2];
            if (sum1 == (sum / 2))
                return "Yes";
            else if (sum1 < (sum / 2))
                p1++;
            else
                p2--;
        }
        return"No";
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
