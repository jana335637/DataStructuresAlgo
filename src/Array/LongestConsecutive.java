package Array;

import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0, cnt=1;
        for(Integer num : set) {
            if(!set.contains(num - 1)) {
                while(set.contains(num + 1)) {
                    cnt++;
                }
                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}
