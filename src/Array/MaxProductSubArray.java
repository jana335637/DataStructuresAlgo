package Array;

public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        int prefix = 1, suffix = 1, n=nums.length, ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            prefix *= nums[i];
            suffix *= nums[n-i-1];
            if(prefix == 0 ) {
                prefix= 1;
            }
            if(suffix == 0 ) suffix = 1;
            ans = Math.max(ans, prefix);
            ans = Math.max(ans, suffix);
        }
        return ans;
    }
}
