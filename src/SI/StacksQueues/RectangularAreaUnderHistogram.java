package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RectangularAreaUnderHistogram {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            rectangularArea();
        }
    }

    static void rectangularArea() throws Exception {
        String s = br.readLine();
        int n = Integer.parseInt(s), top = -1;
        int[] stack = new int[n], a = new int[n], r = new int[n], l = new int[n];
        s = br.readLine();
        String[] strings = s.split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strings[i]);
        }
        for (int i = 0; i < n; i++) {
            while (top != -1 && a[i] < a[stack[top]]) {
                r[stack[top]] = i;
                --top;
            }
            stack[++top] = i;
        }
        while (top >= 0) {
            r[stack[top]] = n;
            --top;
        }
        for (int i = n - 1; i >= 0; i--) {
            while (top != -1 && a[i] < a[stack[top]]) {
                l[stack[top]] = i;
                --top;
            }
            stack[++top] = i;
        }
        while (top >= 0) {
            l[stack[top]] = -1;
            --top;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (((r[i] - l[i]-1) * a[i]) > max)
                max = ((r[i] - l[i]-1) * a[i]);
        }
        System.out.println(max);
    }
    public int largestRectangleArea(ArrayList<Integer> A) {
        int n = A.size(), top = -1;
        int[] stack = new int[n], a = new int[n], r = new int[n], l = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = A.get(i);
        }
        for (int i = 0; i < n; i++) {
            while (top != -1 && a[i] < a[stack[top]]) {
                r[stack[top]] = i;
                --top;
            }
            stack[++top] = i;
        }
        while (top >= 0) {
            r[stack[top]] = n;
            --top;
        }
        for (int i = n - 1; i >= 0; i--) {
            while (top != -1 && a[i] < a[stack[top]]) {
                l[stack[top]] = i;
                --top;
            }
            stack[++top] = i;
        }
        while (top >= 0) {
            l[stack[top]] = -1;
            --top;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (((r[i] - l[i]-1) * a[i]) > max)
                max = ((r[i] - l[i]-1) * a[i]);
        }
        return max;
    }

}
