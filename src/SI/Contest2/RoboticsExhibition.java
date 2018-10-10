package SI.Contest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by pillutja on 8/26/2018.
 */
public class RoboticsExhibition {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            System.out.println(subArray());
        }
    }
    static int subArray() throws Exception {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] a = new int[n];
        s=br.readLine();
        String[] strings = s.split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strings[i]);
        }
        int count=0,flag=0;
        for (int k = 1; k < Integer.MAX_VALUE; k++) {
            flag=0;
                for (int i = 0; i < n; i++) {
                    int sum=0;
                    if(flag==1)
                        break;
                    for (int j = i; j < n; j++) {
                        sum+=a[j];
                        if(sum==k){
                            flag=1;
                            break;
                        }
                    }
                }
                if(flag==0)
                    return k;
            }
            return 0;
    }
}
