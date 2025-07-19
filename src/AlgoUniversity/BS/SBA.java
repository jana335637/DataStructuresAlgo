package AlgoUniversity.BS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SBA {
    public static void main(String[] args) throws IOException {
        int[] num = takeInput();
        int l=-1, r=num.length;
        while(l+1 < r){
            int m = l + (r-l)/2;
            if(num[m]==0)
                l=m;
            else
                r=m;
        }
        if(r<num.length){
            System.out.println(r);
        } else {
            System.out.println(num.length);
        }
        if(l >=0)
            System.out.println(l);
        else
            System.out.println(-1);

    }
    private static int[] takeInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }
        return arr;
    }
}
