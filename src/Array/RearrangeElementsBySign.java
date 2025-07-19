package Array;

public class RearrangeElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int pos=0, neg=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                nums[neg] = nums[i];
                neg+=2;
            } else{
                nums[pos] = nums[i];
                pos+=2;
            }
        }
        return nums;
    }
}
