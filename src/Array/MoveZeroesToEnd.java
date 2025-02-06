package Array;

import java.text.ParseException;
import java.util.Date;

public class MoveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        int l=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[l++] = nums[i];
            }
        }
        while (l < nums.length) {
            nums[l++] = 0;
        }
    }

    public boolean rotateString(String s, String goal) {
        if((s+s).contains(goal)) return true;
        return false;
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(  new Date( "01/01/2000"));
        System.out.println(  new Date( 100,0,1));
    }
}
