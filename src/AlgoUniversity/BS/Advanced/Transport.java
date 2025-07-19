package AlgoUniversity.BS.Advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Transport {
    static int n, m, c;
    static long[] arr;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        takeInput();
        Arrays.sort(arr);
        long l = -1, r = arr[n-1];
        while(l + 1 < r) {
            long  mid = l + (r - l) / 2;
            if(pred(mid, c, m, arr) == 0){
                l = mid;
            } else {
                r = mid;
            }
        }
        System.out.println(r);
    }
    static int pred(long m, int c, long mid, long[] arr) {
       /* int cc = 0, noOfBuses = 1;
        long firstPerson = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(cc >= c || arr[i]-firstPerson > mid){
                noOfBuses++;
                cc=1;
            } else{
                cc++;
            }
            firstPerson=arr[i];
        }*/
        int i=0, cc=1, noOfBuses=1;
        long firstPerson = arr[0];
        while(i < arr.length) {
            if(cc > c || arr[i]-firstPerson > mid){
                noOfBuses++;
                cc=1;
                firstPerson = arr[i];
            }
            cc++;
            i++;
        }
        // 1 1 3 4 10 14
        if(noOfBuses <= m)
            return 1;
        return 0;
    }

    public static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new long[n];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
    }
}
