package AlgoUniversity.OA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlowerPots {
    static int n,k;
    static int[][] arr;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        takeInput();
        int[] ans = new int[n];
        for (int i = 0; i < k; i++) {
            int l = arr[i][0]; int r = arr[i][1];
            ans[l-1]++;
            if(r<n){
                ans[r]--;
            }
        }
        System.out.print(ans[0] + " ");
        for (int i = 1; i < n; i++) {
            ans[i] += ans[i-1];
            System.out.println(ans[i] + " ");
        }
    }

    private static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken()); k = Integer.parseInt(st.nextToken());
        arr = new int[k][2];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(reader.readLine());
            arr[i][0] =Integer.parseInt(st.nextToken());
            arr[i][1] =Integer.parseInt(st.nextToken());
        }
    }
}
