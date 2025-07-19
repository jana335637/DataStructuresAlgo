package AlgoUniversity.Arrays;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TRoomEasy_Twosum {
    public static void main(String[] args) throws IOException {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int n = reader.read(), w=reader.read();
        System.out.println(n);
            int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] =reader.read();
        }*/
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), w=input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(w-arr[i])){
                System.out.println(map.get(w-arr[i]) + " " + (i+1));
                return;
            } else{
                map.put(arr[i], i+1);
            }
        }
        System.out.println(-1);
    }
}
