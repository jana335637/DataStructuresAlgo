package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public int[] twoSumTwoPointers(int[] nums, int target) {
        Arrays.sort(nums);
        int[] res=new int[2];
        int l=0, r=nums.length;
        while (l < r) {
            if(nums[l]+nums[r]== target){
                res[0]=l;res[1]=r;
                return res;
            } else if(nums[l]+nums[r] < target){
                l++;
            } else{
                r--;
            }
        }
        return res;
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                res[0]=i;res[1]=map.get(target-nums[i]);
                return res;
            } else {
                map.put(nums[i],i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] res  =twoSum(new int[]{1,2,3,4,5}, 6);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        System.out.println();
    }
}
