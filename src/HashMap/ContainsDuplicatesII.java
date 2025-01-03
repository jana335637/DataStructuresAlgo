package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 || k<=0) return false;
        Map<Integer, Integer> map =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])!=null){
                if(i-map.get(nums[i]) <= k) return true;
            } else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
