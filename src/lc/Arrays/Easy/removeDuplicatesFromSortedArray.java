package lc.Arrays.Easy;

public class removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int r=-1;
        boolean found=false;
        if(nums.length==1 || (nums.length==2 && nums[0]==nums[1])){
            return 1;
        }

        for (int i = 0; i <= nums.length - 2; i++) {
            if(nums[i] == nums[i+1] && r==-1){
                r=i+1;
                found=true;
            }
            if(found && nums[i]!=nums[i+1]){
                nums[r++] = nums[i+1];
            }
        }
        if(!found){
            return nums.length;
        }
        return r;
    }
}
