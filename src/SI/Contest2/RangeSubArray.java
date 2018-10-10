package SI.Contest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by pillutja on 8/26/2018.
 */
public class RangeSubArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            System.out.println(subArray());
        }
    }
    static int subArray() throws Exception {
        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]), r1 = Integer.parseInt(s.split(" ")[1]),
                r2= Integer.parseInt(s.split(" ")[2]);
        long[] a = new long[n];
        s=br.readLine();
        String[] strings = s.split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(strings[i]);
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            long sum=0;
            for (int j = i; j < n; j++) {
                sum+=a[j];
                if((r1<sum && r2>sum) || r1==sum || r2==sum)
                    count++;
            }
        }
        return count;
    }
}
