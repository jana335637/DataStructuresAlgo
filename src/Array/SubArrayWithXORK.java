package Array;

import java.util.HashMap;

public class SubArrayWithXORK {
    public int solve(int[] A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int xor = 0, cnt=0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
            int x = xor ^ B ;
            if(map.containsKey(x)) {
                cnt += map.get(x);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return cnt;
    }
}
