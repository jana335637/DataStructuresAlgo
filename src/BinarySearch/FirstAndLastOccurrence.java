package BinarySearch;

public class FirstAndLastOccurrence {
    public int[] searchRange(int[] nums, int target) {
        int floor = firstOccurrence(nums, target);
        int ceil = lastOccurrence(nums, target);
        return new int[]{floor, ceil};
    }

    private int lastOccurrence(int[] nums, int target) {
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
        if(ans != -1 && nums[ans] == target) {
            return ans;
        }
        return -1;
    }

    private int firstOccurrence(int[] nums, int target) {
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
        if(nums[ans] == target) {
            return ans;
        }
        return -1;
    }
}
