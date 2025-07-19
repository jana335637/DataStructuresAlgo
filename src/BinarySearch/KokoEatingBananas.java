package BinarySearch;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] nums, int threshold) {
        int n = nums.length, low = 0, high = maxOfElements(nums);
        if(n>threshold) return -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(sumByD(nums, mid) <= threshold){
                high= mid-1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }

    private int maxOfElements(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }

    private int sumByD(int[] nums, int mid) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+= Math.ceil((double)nums[i]/(double)mid);
        }
        return sum;
    }
}
