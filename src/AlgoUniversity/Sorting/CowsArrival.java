package AlgoUniversity.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CowsArrival {
    static int n, q;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] arr, wt;
    public static void main(String[] args) throws IOException {
        takeInput();
        /*
        *
        * 4 778
429 336 : 1114
651 28 : 1142
1319 764 : 1906
2546 1042 : 4588
7695 212 : 7907
9705 430 :
12498 136
13559 3127
14372 863
*/
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], wt[i]);
        }
    }
    private static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        wt = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            wt[i] = Integer.parseInt(st.nextToken());
        }
    }
}
