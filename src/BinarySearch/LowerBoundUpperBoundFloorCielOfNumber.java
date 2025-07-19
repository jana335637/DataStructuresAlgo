package BinarySearch;

public class LowerBoundUpperBoundFloorCielOfNumber {
    public int[] searchRange(int[] nums, int target) {
        int floor = lowerBound(nums, target);
        int ceil = upperBound(nums, target);
        return new int[]{floor, ceil};
    }

    private int upperBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid  = low + (high - low) / 2;
            if(nums[mid] <= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private int lowerBound(int[] nums, int target) {
        int low = 0, high = nums.length - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
