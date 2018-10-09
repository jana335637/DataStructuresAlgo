package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by pillutja on 8/17/2018.
 */
public class NearestSmallerElement {

    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int testCases = Integer.parseInt(s);
        for (int i = 0; i < testCases; i++) {
            System.out.println(prevSmaller(new ArrayList<>(Arrays.asList(1))));
        }
    }

    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        int n = A.size(), top = -1;
        int[] stack = new int[n], l = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (top != -1 && A.get(i) < A.get(stack[top])) {
                l[stack[top]] = i;
                --top;
            }
            stack[++top] = i;
        }
        while (top >= 0) {
            l[stack[top]] = -1;
            --top;
        }
        ArrayList<Integer> small = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            small.add((l[i]<0)?-1:A.get(l[i]));
        }
        return small;
    }
}
