package AlgoUniversity.OA1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class EasyCounting {
    static int testCases, w, h, n;
    static int[][] arr;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        String s = reader.readLine();
        long ans=0;
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c: map.keySet()) {
            n = map.get(c);
            if(n>1){
                ans += Math.pow(n, 2);
            } else {
                ans +=1;
            }
        }
        if(ans == 0){
            System.out.println(s.length());
            return;
        }
        System.out.println(ans);
    }
}
