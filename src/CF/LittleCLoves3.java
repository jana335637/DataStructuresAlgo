package CF;

import java.util.Scanner;

/**
 * Created by pillutja on 8/24/2018.
 */
public class LittleCLoves3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        getTripletExistence();
    }

    private static void getTripletExistence() {
        long n = in.nextLong();
            long m = n/3;
            long mRemainder = m%3;
            long nRemainder = n%3;
            long rem = n%(m*3);
            if(mRemainder!=0 ){
                if(rem==0)
                    System.out.println(n/3+" "+n/3+" "+n/3);
                else
                {
                    if(rem==1 && ((m+1)%3)==0)
                        System.out.println((m-1)+" "+m+" "+(m+rem+1));
                    else if(rem==2 && ((m+2)%3)==0)
                        System.out.println(m+" "+(m+1)+" "+(m+1));
                    else
                        System.out.println(m+" "+(m)+" "+(m+rem));
                }
            }else{
                if(rem==0)
                    System.out.println((m-1)+" "+(m-1)+" "+(m+2));
                else{
                    System.out.println((m-1)+" "+(m+1)+" "+(m+rem));
                }
            }
    }
}
