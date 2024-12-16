package Binary;

public class NumberOfSetBits {
    public static void main(String[] args) {
        //System.out.println(hammingWeight(11));
    }
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum = n*(n+1)/2,arraySum = 0;
        for (int i = 0; i < nums.length; i++) {
            arraySum +=nums[i];
        }
        return sum- arraySum;
    }
    public int hammingWeight(int n) {
        int c=0, one = 1;
        while(n>0){
            if((n & one) == 1) c++;
            n=n>>1;
        }
        return c;
    }

    public int[] countBits(int n) {
        int[] array = new int[n+1];
        for (int i = 0; i <= n; i++) {
            array[i]=hammingWeight(i);
        }
        return array;
    }
}
