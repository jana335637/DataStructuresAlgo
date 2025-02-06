package Greedy;

public class JumgGameI {
    public boolean canJump(int[] nums) {

        int n = nums.length;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i > maxIndex) return false;
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        JumgGameI jumgGameI = new JumgGameI();
        System.out.println(jumgGameI.canJump(new int[]{3,2,1,0,4}));
    }

    public int Jump(int[] nums) {

        int n = nums.length, l=0, r=0, jumps= 0;
        while(r<n-1){
            int farthest = 0;
            for(int i=l; i<=r; i++){
                farthest = Math.max(farthest, nums[i]+i);
            }
            l = r+1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }
}
