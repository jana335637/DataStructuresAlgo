package DP;

public class MaxSumSubsequenceOfNonAdjacentElements {
    public static void main(String[] args) {
        MaxSumSubsequenceOfNonAdjacentElements max = new MaxSumSubsequenceOfNonAdjacentElements();
        int[] nums = {3,5,9};
    int[][] queries={{1,-2},{0,-3}};
        System.out.println(max.maximumSumSubsequence(nums, queries));
    }
    public int maximumSumSubsequence(int[] nums, int[][] queries) {
        int mod = (int) (1e9+7);
        int[] tmp = new int[nums.length];
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            tmp[j]=nums[j];
        }
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            tmp[query[0]]=query[1];
            printArray(tmp);
            sum+=maxSumNonAdjacent(tmp);
            System.out.println(sum);
        }
        return sum%mod;
    }

    private void printArray(int[] tmp){
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }
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
