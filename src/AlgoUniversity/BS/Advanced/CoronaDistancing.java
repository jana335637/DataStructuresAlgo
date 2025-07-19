package AlgoUniversity.BS.Advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CoronaDistancing {
    static int n, m;
    static long[][] arr;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        takeInput();
        int k=0;
        long[] sorted = new long[arr.length*2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                sorted[k++]=arr[i][j];
            }
        }
        Arrays.sort(sorted);k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sorted[k++];
                //System.out.println(arr[i][j]);
            }
        }
        long l = 0, r=arr[arr.length-1][1], mid;
        while(l+1 < r){
            mid = l+ (r-l)/2;
            if (pred(mid, n, m, arr)==0){
                l=mid;
            } else {
                r=mid;
            }
        }
        System.out.println(l);

    }
    static int pred(long dist, int n, int m, long[][] arr){
        long lastPerson = Long.MIN_VALUE, start = Long.MIN_VALUE, peoplePlaced = 0;
        for (int i = 0; i < m; i++) {
            long L = arr[i][0], R = arr[i][1];
            start = Math.max(L, lastPerson+dist);
            if(R >= start){
                long people = (R-start)/dist + 1;
                lastPerson = start + (people-1)*dist;
                peoplePlaced +=people;
            }
        }
        if(peoplePlaced >= n){
            return 0;
        }
        return 1;
    }

    public static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new long[m][2];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(reader.readLine());
            arr[i][0] = Long.parseLong(st.nextToken());
            arr[i][1] = Long.parseLong(st.nextToken());
        }
    }
}
