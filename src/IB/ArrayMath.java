package IB;

import java.util.ArrayList;

/**
 * Created by pillutja on 8/17/2018.
 */
public class ArrayMath {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
        System.out.println(reverse(-1146467285));
    }
    public int isPalindrome(int a) {
        int b = 0,c=a;
        while(a>0){
            b= (b*10)+(a%10);
            a/=10;
        }
        if(b==c){
            return 1;
        }
        return 0;
    }
    public static int reverse(long a) {
        long b = 0,c=a;
        if(a<0)
            a*=-1;
        if(a>Integer.MAX_VALUE)
            return 0;
        while(a>0){
            b= (b*10)+(a%10);
            a/=10;
        }
        if(b>Integer.MAX_VALUE)
            return 0;
        if(c<0)
            return ((int)b*-1);
        return (int)b;
    }


    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        B = B%A.size();
        for (int i = 0; i < A.size() - B; i++) {
            ret.add(A.get(i + B));
        }
        for (int i = 0; i < B; i++) {
            ret.add(A.get(i));
        }

        return ret;
    }
}
