package AlgoUniversity.BS.Advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumCandies {
    static int n, q;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        takeInput();
        //4 5 1 2 3
        int l=0, r=(int)Math.sqrt(n) *2;
        while(l+1 < r){
            int m = l + (r-l)/2;
            if(pred(n, m)==0)
                l=m;
            else
                r=m;
        }
        System.out.println((int)l);
    }
    private static int pred(int n, int m) {
        if((m *(m+1))/2 <= n )
            return 0;
        else
            return 1;
    }

    public static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken());
    }
}
