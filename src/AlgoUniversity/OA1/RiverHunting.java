package AlgoUniversity.OA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RiverHunting {
    static int testCases, w, h, n;
    static int[] arr;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        testCases = Integer.parseInt(st.nextToken());
        arr = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < testCases; i++) {
            System.out.println((int)(Math.ceil(Math.log(arr[i])/Math.log(2))));
        }
    }
}
