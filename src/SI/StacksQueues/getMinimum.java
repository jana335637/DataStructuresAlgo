package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by pillutja on 9/26/2018.
 */
public class getMinimum {
    int top = -1, minTop = -1;
    ArrayList<Integer> stack = new ArrayList<>();
    ArrayList<Integer> minStack = new ArrayList<>();

    public void getMinimum() {
        top = -1;
        minTop = -1;
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
    }

    //19 P 10 P 9 g P 8 g P 7 g P 6 g p g p g p g p g p g
    //9 8 7 6 7 8 9 10 -1
    public void push(int x) {
        if ((top+1) < stack.size() && top!=-1)
            stack.set(++top, x);
        else{
            stack.add(x);
            top++;
        }
        if (minTop == -1){
            minStack.add(x);
            minTop++;
        }
        else {
            if (x < minStack.get(minTop)) {
                if ((minTop+1) < minStack.size())
                    minStack.set(++minTop, x);
                else {
                    minStack.add(x);
                    ++minTop;
                }
            }

        }
    }

    public void pop() {
        if (top != -1) {
            if (stack.get(top) == minStack.get(minTop))
                minTop--;
            top--;
        }

    }

    public int top() {
        return ((top == -1) ? -1 : stack.get(top));
    }

    public int getMin() {
        return ((minTop == -1) ? -1 : minStack.get(minTop));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            System.out.println("Case :" + (i + 1));
        }
    }
}
