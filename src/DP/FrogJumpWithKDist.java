package DP;

public class FrogJumpWithKDist {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int[] dp = new int[arr.length];
        dp[0]=0;
        return frogJumpMinCost(k, arr, dp);
    }

    private int frogJumpMinCost(int k, int[] arr, int[] dp) {
        for (int i = 1; i < arr.length; i++) {
            int mmSteps=Integer.MAX_VALUE;
            for (int j = 1; j < i; j++) {
                if(i-j>=0){
                    int jumpCost = dp[i-j] + Math.abs(arr[i]-arr[j]);
                    mmSteps = Math.min(mmSteps, jumpCost);
                }
            }
            dp[i]=mmSteps;
        }
        return dp[arr.length-1];
    }
}
