package AlgoUniversity.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class TRoomThreeSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(reader.readLine());
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] =Integer.parseInt(st.nextToken());
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i+1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int third = w-arr[i]-arr[j];
                if(map.containsKey(third)){
                    int pos = map.get(third);
                    if(pos > j){
                        int[] ans = {i+1, j+1, pos};
                        System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
                        return;
                    }
                }
            }
            map.put(arr[i], i+1);
        }
        System.out.println(-1);


    }
    /*static boolean found(Map<Integer, Integer> map, int keyToFind){
        for(Integer key : map.keySet()){
            System.out.println(key+" "+map.get(key));
            if(map.get(keyToFind-key) != null){
                System.out.println("inside" + keyToFind + " "+(keyToFind-key)+" "+map.get(keyToFind-key));
                System.out.print(map.get(keyToFind-key) + " ") ;
                System.out.print(map.get(key)+ " ");
                return true;
            }
        }
        return false;
    }*/
}
