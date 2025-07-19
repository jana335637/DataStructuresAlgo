package Array;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])>nums.length/2)
                return nums[i];
        }
        return -1;
    }
    public int majorityElement2(int[] nums) {
        int ele=nums[0];
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if(count==0){
                ele=nums[i];
            }
            if(nums[i]==ele){
                count++;
            } else{
                count--;
            }
        }
        if(count>0){return ele;}
        return -1;
    }
}
