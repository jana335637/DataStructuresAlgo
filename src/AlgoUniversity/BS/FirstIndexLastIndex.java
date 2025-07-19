package AlgoUniversity.BS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FirstIndexLastIndex {
    static int n, q;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        int[] arr= takeInput();
        int [] queries = new int[q];
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(reader.readLine());
            queries[i] =Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < q; i++) {
            System.out.println( printFirstIndex(arr, queries[i]) + " " +
            printLastIndex(arr, queries[i]));
        }
    }

    private static int printFirstIndex(int[] arr, int key) {
        int l=-1, r=n;
        while(l+1<r){
            int m = l+ (r-l)/2;
            if(firstIndexpredicate(arr[m],key) ==0)
                l=m;
            else
                r=m;
        }
        if(r<n && arr[r]==key)
            return r;
        else
            return -1;
    }

    private static int printLastIndex(int[] arr, int key) {
        int l=-1, r=n;
        while(l+1<r){
            int m = l+ (r-l)/2;
            if(lastIndexpredicate(arr[m],key) ==0)
                l=m;
            else
                r=m;
        }
        if(l>=0 && arr[l]==key)
            return l;
        else
            return -1;
    }

    static int firstIndexpredicate(int val, int key){
        if(val < key)
            return 0;
        else
            return 1;
    }

    static int lastIndexpredicate(int val, int key){
        if(val <= key)
            return 0;
        else
            return 1;
    }

    private static int[] takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken()); q = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }
        return arr;
    }
}
