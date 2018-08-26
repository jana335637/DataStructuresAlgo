package SI.Contest1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by pillutja on 8/26/2018.
 */
public class ConsecutiveSetBits {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            ArrayList<String> ones = new ArrayList<>();
            long x = in.nextLong();
            String string = Long.toBinaryString(x);
            int max = 0;
            for (String s :
                    string.split("0")) {
                if(s.length()>max)
                    max =s.length();
            }
            System.out.println(max);
        }
    }
}
