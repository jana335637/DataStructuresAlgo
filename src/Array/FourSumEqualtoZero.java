package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumEqualtoZero {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < nums.length; j++) {
                if(j != (i+1 ) && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = nums.length-1;
                while (k < l) {
                    long sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    } else if(sum < target) k++;
                    else l--;
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        FourSumEqualtoZero f = new FourSumEqualtoZero();
        System.out.println(f.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -5));
    }
}
