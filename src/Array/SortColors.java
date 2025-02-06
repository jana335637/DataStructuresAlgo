package Array;

public class SortColors {
    public void sortColors(int[] nums) {
        int zero  = 0, one = 0, two = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) zero++;
            if(nums[i]==1) one++;
            if(nums[i]==2) two++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(zero>0){
                nums[i]=0;
                zero--;
            } else if(one>0){
                nums[i]=1;
                one--;
            } else if(two>0){
                nums[i]=2;
                two--;
            }
        }
    }
}
