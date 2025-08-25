package Practice;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        Arrays.sort(nums);
        int[] ans = new int[2];
        int l=0, r= nums.length;
        while(l<r){
            int sum = nums[l]+nums[r];
            if(sum == target){
                ans[0] = nums[l];
                ans[1] = nums[r];
            } else if(sum < target){
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
