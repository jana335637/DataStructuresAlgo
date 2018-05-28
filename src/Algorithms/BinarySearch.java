package Algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2,3,422,323,23211,1,24};
        Arrays.sort(array);
        System.out.println(binarySearch(array,0,array.length-1,4223));

    }

    private static int binarySearch(int[] array, int low,int high,int key) {
        if(high<low)
            return -1;
        int mid = (low+high)/2;
        if(array[mid]==key){
            return mid+1;
        }
        else if(array[mid]<key){
            return binarySearch(array,mid+1,high,key);
        }
        else{
          return  binarySearch(array,low,mid-1,key);
        }
    }
}
