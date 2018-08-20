package IB;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by pillutja on 8/16/2018.
 */
public class findMinXor {
    public int findMinXor(ArrayList<Integer> A) {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < A.size()-1; i++) {
            for (int j = (i+1); j < A.size(); j++) {
                int calc = (A.get(i)^A.get(j));
                if(min>calc)
                    min = calc;
            }
        }
        return min;
    }
}
