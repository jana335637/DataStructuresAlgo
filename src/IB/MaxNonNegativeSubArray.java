package IB;

import java.util.*;

/**
 * Created by pillutja on 8/17/2018.
 */
public class MaxNonNegativeSubArray {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int[] test = [44, 41, 12, 42, 71, 45, 28, 65, 75, 93, 66, 66, 37, 6, 24, 59];
        * [1, 2, 5, -7, 2, 3]*/
        int testCases = in.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            A.add(in.nextInt());
        }
        A = maxset(A);
        for (int num : A) {
            System.out.print(num + " ");
        }

    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int sum = 0, endIndex = 0, startIndex = 0, max = Integer.MIN_VALUE, minIndex = 0, maxSize = 0;
        ArrayList<Integer> B = new ArrayList<Integer>();
        Map<Integer, Integer> C = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 0) {
                sum += A.get(i);
                B.add(sum);
            } else {
                B.add(-1);
                sum = 0;
            }
            if (max < B.get(i)) {
                max = B.get(i);
            }
        }
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i) == -1) {
                startIndex = (i + 1);
            } else if (B.get(i) == max) {
                C.put(i, startIndex);
            }
        }
        for (int endI : C.keySet()) {
            if ((endI - C.get(endI) +1) > maxSize)
                maxSize = (endI - C.get(endI) +1 );
        }
        for (int endI : C.keySet()) {
            if ((endI - C.get(endI) +1) == maxSize){
                endIndex = endI;
                startIndex = C.get(endI);
                break;
            }
        }
        for (int i = startIndex; i <= endIndex; i++) {
            ans.add(A.get(i));
        }
        return ans;
    }
}

