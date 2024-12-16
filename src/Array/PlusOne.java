package Array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            else
                digits[i]=0;
        }
        return digits;
    }
}
