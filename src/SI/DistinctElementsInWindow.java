package SI;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by pillutja on 9/6/2018.
 */
public class DistinctElementsInWindow {
    static Scanner in = new Scanner(System.in);
    static int ans = 0;
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            distinctElements();
            System.out.println();
        }
    }

    private static void distinctElements() {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = in.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (map.keySet().contains(elements[i])){
                int existingCount = map.get(elements[i]);
                map.put(elements[i],++existingCount);
            }
            else
                map.put(elements[i],1);
        }
        System.out.print(map.size()+" ");
        for (int i = 1; i <= n-k; i++) {
            if(map.keySet().contains(elements[i-1]))
            {
                int existingCount = map.get(elements[i-1]);
                if(existingCount==1)
                    map.remove(elements[i-1]);
                else
                    map.put(elements[i-1],--existingCount);
            }
            if(map.keySet().contains(elements[i+k-1]))
            {
                int existingCount = map.get(elements[i+k-1]);
                map.put(elements[i+k-1],++existingCount);
            }
            else
                map.put(elements[i+k-1],1);
            System.out.print(map.size()+" ");
        }
    }

}
