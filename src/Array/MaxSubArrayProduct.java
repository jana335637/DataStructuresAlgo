package Array;

import java.util.Collections;
import java.util.List;

public class MaxSubArrayProduct {
    public static void main(String[] args) {
        List list = Collections.EMPTY_LIST;
        list.stream().forEach(x->x.toString());
        System.out.println(list);
    }
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE, pre=1, suffix=1;
        for (int i = 0; i < nums.length; i++) {
            if(pre==0) pre=1;
            if(suffix==0) suffix=1;
            pre*=nums[i];
            suffix*=nums[nums.length-i-1];
            max= Math.max(max, Math.max(pre, suffix));
        }
        return max;
    }
}
