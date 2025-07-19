package AlgoUniversity.BS.Advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindInRotatedArray {
    static int n, q;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int[] arr = takeInput();
        //4 5 1 2 3
        int l=-1, r=n;
        while(l+1 < r){
            int m = l + (r-l)/2;
            if(pred(arr, m)==0)
                l=m;
            else
                r=m;
        }

        if(l>=0 && r<n){
            System.out.println(arr[r]);
        } else if (r==n){
            System.out.println(arr[0]);
        } else {
            System.out.println(arr[n-1]);
        }
    }
    private static int pred(int[] arr, int m) {
        if(arr[m] > arr[0] )
            return 0;
        else
            return 1;
    }

    public static int[] takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
}
