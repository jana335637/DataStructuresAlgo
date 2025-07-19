package AlgoUniversity.BS.Advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EmptyThePiles {
    static int n, h;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int[] arr = takeInput();
        //4 5 1 2 3
        int l=0, r= getmax(arr);
        while(l+1 < r){
            int m = l + (r-l)/2;
            if(pred(arr, h, m)==0)
                l=m;
            else
                r=m;
        }
        System.out.println(r);
    }

    private static int getmax(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private static int pred(int[] arr, int m, int h) {
        int ops=0;
        for (int i = 0; i < arr.length; i++) {
            ops+=(arr[i]+m-1)/m;
        }
        if(ops <= h)
            return 1;
        else
            return 0;
    }

    private static int ceil(int i) {
        return 0;
    }

    public static int[] takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken()); h=Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
}
