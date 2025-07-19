package AlgoUniversity.BS.Advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoxPacking {
    static int testCases, w, h, n;
    static int[][] arr;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        takeInput();
        for (int i = 0; i < testCases; i++) {
            w = arr[i][0];
            h = arr[i][1];
            n = arr[i][2];
            int ans = findMinSquare(w,h,n);
            System.out.println(ans*Math.max(w,h));
        }
    }

    private static int findMinSquare(int w, int h, int n) {
        int l=0, r= n* 2;
        while(l+1 < r){
            int m = l + (r-l)/2;
            if(pred( m, w, h, n)==0)
                l=m;
            else
                r=m;
        }
        return r;
    }

    private static int getmax(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private static int pred(int m, int w, int h, int n) {
        int max = Math.max(w, h), product = max*m;
        int maxBoxesPerRow = Math.max(product/w, product/h), totalBoxes =maxBoxesPerRow* m;
        if(totalBoxes >= n)
            return 1;
        else
            return 0;
    }

    private static int ceil(int i) {
        return 0;
    }

    public static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        testCases = Integer.parseInt(st.nextToken());
        arr = new int[testCases][3];
        for (int i = 0; i < testCases; i++) {
            st = new StringTokenizer(reader.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
    }
}
