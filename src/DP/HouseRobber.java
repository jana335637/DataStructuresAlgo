package DP;

public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] arr1 = new int[nums.length], arr2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i!=0){
                arr1[i]=nums[i];
            }
            if(i!=nums.length-1) arr2[i]= nums[i];
        }
        return Math.max(maxSumNonAdjacent(arr1), maxSumNonAdjacent(arr2));
    }
    private int maxSumNonAdjacent(int[] tmp) {
        int n=tmp.length;
        int prev=0, prev2=0;
        if(tmp[0]>0) prev = tmp[0];
        for (int i = 1; i < n; i++) {
            int pick = tmp[i];
            if(i>1){
                pick+=prev2;
            }
            int nonPick = prev;
            System.out.println("pick : " + pick + ", NonPick:" + nonPick);
            int cur_i = Math.max(pick, nonPick);
            System.out.println();
            prev2=prev;
            prev=cur_i;
        }
        return prev;
    }
}
