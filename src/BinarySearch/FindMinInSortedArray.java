package BinarySearch;

public class FindMinInSortedArray {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int low = 0, high = nums.length - 1, ans = Integer.MAX_VALUE, index = low;
        while(low <= high) {
            int mid =( low + high)/ 2;
            if(nums[low] <= nums[high]){
                ans = Math.min(nums[low], ans);
                break;
            }
            if(nums[low] <= nums[mid]){
                ans = Math.min(nums[low], ans);
                low = mid + 1;
            } else {
                ans = Math.min(nums[low], ans);
                high = mid - 1;
            }
        }
        return ans;
    }
}
