package DP;

public class FrogJumpDP3 {
    public int minimumEnergy(int arr[],int N){
        //code here
        int prev=0, prev2=0;
        for (int i = 1; i < arr.length; i++) {
            int jumpTwo= Integer.MAX_VALUE;
            int jumpOne = prev + Math.abs(arr[i] - arr[i-1]);
            if(i>1){
                jumpTwo = prev2 + Math.abs(arr[i] - arr[i-2]);
            }
            int cur_i = Math.min(jumpOne, jumpTwo);
            prev2 = prev;
            prev = cur_i;
        }
        return  prev;
    }
}
