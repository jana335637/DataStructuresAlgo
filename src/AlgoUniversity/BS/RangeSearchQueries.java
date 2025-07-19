package AlgoUniversity.BS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RangeSearchQueries {
    static int n, q;
    static int[] arr;
    static int[][] queries;
    public static void main(String[] args) throws IOException {
        takeInput();
        Arrays.sort(arr);
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int lb = getLowerBound(arr, queries[i][0]);
            int ub = getUpperBound(arr, queries[i][1]);
            if(ub==0)
                ans[i]=0;
            else {
                if(lb<=0)
                    ans[i]=ub;
                else{
                    ans[i]=ub-lb-1;
                }
            }
        }
        for (int i = 0; i < q-1; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.print(ans[q-1]);
    }

    private static int getLowerBound(int[] arr, int key) {
        int l=-1,r=n;
        while(l+1 < r){
            int mid=l + (r-l)/2;
            if(arr[mid] <= key){
                l=mid;
            }
            else{
                r=mid;
            }
        }
        return l;
    }

    private static int getUpperBound(int[] arr, int key) {
        int l=-1,r=n;
        while(l+1 < r){
            int mid=l + (r-l)/2;
            if(arr[mid] <= key){
                l=mid;
            }
            else{
                r=mid;
            }
        }
        return r;
    }

    private static void takeInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); q = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        queries = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                queries[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}
