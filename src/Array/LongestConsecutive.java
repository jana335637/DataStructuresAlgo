package Array;

import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {set.add(num);}
        int longest = Integer.MIN_VALUE;;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i]- 1)) {
                int cnt=1, x =nums[i];
                while (set.contains(x + 1)) {
                    cnt++;
                    x++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
