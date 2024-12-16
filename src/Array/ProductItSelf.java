package Array;

public class ProductItSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] preFix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] products = new int[nums.length];
        preFix[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            preFix[i]= preFix[i-1]*nums[i];
        }
        suffix[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i >=0; i--) {
            suffix[i]=suffix[i+1]*nums[i];
        }
        products[0]=suffix[1];
        products[nums.length-1]=preFix[nums.length-2];
        for (int i = 1; i < nums.length-1; i++) {
            products[i]=preFix[i-1]*suffix[i+1];
        }
        return products;
    }
}
