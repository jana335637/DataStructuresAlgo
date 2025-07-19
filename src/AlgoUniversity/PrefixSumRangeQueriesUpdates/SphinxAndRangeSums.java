package AlgoUniversity.PrefixSumRangeQueriesUpdates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SphinxAndRangeSums {
    static int n, q;
    static int[] arr;
    static int[][] queries;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        takeInput();
        long[] prefixSum = new long[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1]+ arr[i];
        }
        for (int i = 0; i < q; i++) {
            int l = queries[i][0], r = queries[i][1];
            if(l==1){
                System.out.println(prefixSum[r-1]);
            } else{
                System.out.println(prefixSum[r-1]-prefixSum[l-2]);
            }
        }
    }
    public static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(reader.readLine());
        q = Integer.parseInt(st.nextToken());
        queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(reader.readLine());
            queries[i][0] = Integer.parseInt(st.nextToken());
            queries[i][1] = Integer.parseInt(st.nextToken());
        }
    }
}
