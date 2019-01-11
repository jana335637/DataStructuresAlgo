package CF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SquaresSegments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        int n = in.nextInt();
        if (n == 1)
            System.out.println(2);
        else if (n == 2)
            System.out.println(3);
        else if (n == 3 || n == 4)
            System.out.println(4);
        else {
            int x = ((int) Math.floor(Math.sqrt(n)));
            ans = (x - 2) * 2 + 4;
            if (n > (Math.pow(x, 2) + x))
                ans += 2;
            else
                ans += 1;
            System.out.println(ans);
        }
    }

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> ans1 = new ArrayList<>();
        int s = 0, r = 1;
        for (int i = A.size() - 1; i >= 0; i--) {
            s = A.get(i) + r;
            if (s == 10) {
                ans.add(0);
                r = 1;
            } else {
                ans.add(s);
                r = 0;
            }
        }
        if (r == 1)
            ans.add(1);
        boolean start = false;
        for (int i = ans.size() - 1; i >= 0; i--) {
            if(ans.get(i)!=0 || start==true){
                start=true;
                ans1.add(ans.get(i));
            }
        }
        return ans1;
    }
    public int maxSubArray(final List<Integer> A){
        int max =Integer.MIN_VALUE, tempMax=0;
        for (int i = 0; i < A.size(); i++) {
            tempMax+=A.get(i);
            if(tempMax>max){
                max=tempMax;
            }
            if(tempMax<0){
                tempMax=0;
            }
        }
        return max;
    }


}
