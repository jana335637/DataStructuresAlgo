package AlgoUniversity.Arrays;

import java.util.Scanner;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n], result = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int x=0, y=n-1, end = n-1;
        while(end>=0) {
            if(Math.pow(arr[y],2) > Math.pow(arr[x],2)) {
               result[end--] = (int) Math.pow(arr[y],2);
               y--;
            } else {
                result[end--] = (int) Math.pow(arr[x],2);
                x++;
            }
        }
        for(int j = 0; j < result.length; j++) {
            System.out.print(result[j]+" ");
        }
    }
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int x=0, y=n-1, end = n-1;
        while(end>=0) {
            if(Math.pow(nums[y],2) > Math.pow(nums[x],2)) {
                result[end--] = (int) Math.pow(nums[y],2);
                y--;
            } else {
                result[end--] = (int) Math.pow(nums[x],2);
                x++;
            }
        }
        return result;
    }
}
