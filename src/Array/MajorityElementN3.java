package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElementN3 {
    public List<Integer> majorityElement(int[] nums) {
        int el1= Integer.MIN_VALUE, el2=Integer.MIN_VALUE, cnt1=0, cnt2=0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(cnt1==0 && nums[i]!=el2){
                el1=nums[i];
                cnt1++;
            }
            else if (cnt2==0 && nums[i]!=el1) {
                cnt2++;
                el2 = nums[i];
            }
            else if (nums[i]==el1)
                cnt1++;
            else if (nums[i]==el2)
                cnt2++;
            else {
                cnt1--;cnt2--;
            }
        }
        if(cnt1 > nums.length/3)
        {
            list.add(el1);
        }
        if(cnt2 > nums.length/3)
            list.add(el2);
        Collections.sort(list);
        return list;
    }

}
