package SI;

import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigInteger;

/**
 * Created by pillutja on 8/15/2018.
 */
public class Practice {
    public static void main(String[] args) {
        System.out.println(1<<2);
        System.out.println(Integer.toBinaryString(-1)+"\n"+Integer.toBinaryString(-1 << 2)+ "\n"+Integer.toBinaryString(-1 << 2));
        System.out.println(1l<<2);
        //BigInteger bigInteger = new BigInteger(null);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE)+" "+ Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE)+" "+Integer.MIN_VALUE);
        System.out.println(Long.toBinaryString(Long.MAX_VALUE)+" "+ Long.MAX_VALUE);
        System.out.println(Long.toBinaryString(Long.MIN_VALUE)+" "+Long.MIN_VALUE);

/*
        System.out.println(~4);
        System.out.println(Integer.toBinaryString(~4));
        System.out.println(Integer.toBinaryString(-4));
        System.out.println(Integer.toBinaryString(~25));
        System.out.println(~25);
        System.out.println(~0);
        System.out.println(Integer.toBinaryString(0));
        System.out.println(Integer.toBinaryString(~0));
*/
    }


}
