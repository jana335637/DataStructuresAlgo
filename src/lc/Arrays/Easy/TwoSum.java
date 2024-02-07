package lc.Arrays.Easy;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[nums.length], res = new int[2];
        int k=0;
        for (int n :
                nums) {
            array[k++]=n;
        }
        Arrays.sort(nums);
        printArray(nums);
        int p1 = 0, p2=nums.length-1;
        while(p1<p2){
            int sum = nums[p1]+nums[p2];
            if(sum==target){
                return indices(array, nums[p1], nums[p2]);
            } else if(sum<target){
                p1++;
            } else {
                p2--;
            }
        }
        res[0]=0;
        res[1]=1;
        return res;
    }

    private int[] indices(int[] array, int num, int num1) {
        int[] res = new int[2];
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num){
                res[0]=i;
                break;
            }
        }
        for (int i = array.length-1; i >= 0; i--) {
            if(array[i]==num1){
                res[1]=i;
                break;
            }
        }
        return res;
    }

    private void printArray(int[] array) {
        for (int n :
                array) {
            System.out.print(n +  " ");
        }
        System.out.println();
    }
}
