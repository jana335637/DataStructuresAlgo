package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by pillutja on 8/17/2018.
 */
public class EvaluateExpression {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int testCases = Integer.parseInt(s);
        for (int i = 0; i < testCases; i++) {
            System.out.println(evalRPN(new ArrayList<>(Arrays.asList("3", "2", "3", "+", "5","*", "+", "6", "-", "15","+"))));
        }
    }

    public static int evalRPN(ArrayList<String> A) {
        if(A.size()==1)
            return Integer.parseInt(A.get(0));
        Stack<String> stack = new Stack<>();
        int n1 = 0, n2 = 0,flag=1;
        for (int i = A.size() - 1; i >= 0; i--) {
            stack.push(A.get(i));
        }
        ArrayList<Integer> arr1 = new ArrayList<>(), arr2 = new ArrayList<>();
        while (!stack.isEmpty()) {
            String s = stack.pop();
            if ("+".equals(s)) {
                if(flag==1){
                    n1  = arr1.get(arr1.size()-2);
                    n2  = arr1.get(arr1.size()-1);
                    n1 += n2;
                    if(arr1.size()>2){
                        for (int i = 0; i < arr1.size() - 2; i++) {
                            arr2.add(arr1.get(i));
                        }
                    }
                    arr2.add(n1);
                    arr1 = new ArrayList<>();
                    flag=2;
                }
                else{
                    n1  = arr2.get(arr2.size()-2);
                    n2  = arr2.get(arr2.size()-1);
                    n1 += n2;
                    if(arr2.size()>2){
                        for (int i = 0; i < arr2.size() - 2; i++) {
                            arr1.add(arr2.get(i));
                        }
                    }
                    arr1.add(n1);
                    arr2 = new ArrayList<>();
                    flag=1;
                }
            } else if ("-".equals(s)) {
                if(flag==1){
                    n1  = arr1.get(arr1.size()-2);
                    n2  = arr1.get(arr1.size()-1);
                    n1 -= n2;
                    if(arr1.size()>2){
                        for (int i = 0; i < arr1.size() - 2; i++) {
                            arr2.add(arr1.get(i));
                        }
                    }
                    arr2.add(n1);
                    arr1 = new ArrayList<>();
                    flag=2;
                }
                else{
                    n1  = arr2.get(arr2.size()-2);
                    n2  = arr2.get(arr2.size()-1);
                    n1 -= n2;
                    if(arr2.size()>2){
                        for (int i = 0; i < arr2.size() - 2; i++) {
                            arr1.add(arr2.get(i));
                        }
                    }
                    arr1.add(n1);
                    arr2 = new ArrayList<>();
                    flag=1;
                }
            } else if ("*".equals(s)) {
                if(flag==1){
                    n1  = arr1.get(arr1.size()-2);
                    n2  = arr1.get(arr1.size()-1);
                    n1 *= n2;
                    if(arr1.size()>2){
                        for (int i = 0; i < arr1.size() - 2; i++) {
                            arr2.add(arr1.get(i));
                        }
                    }
                    arr2.add(n1);
                    arr1 = new ArrayList<>();
                    flag=2;
                }
                else{
                    n1  = arr2.get(arr2.size()-2);
                    n2  = arr2.get(arr2.size()-1);
                    n1 *= n2;
                    if(arr2.size()>2){
                        for (int i = 0; i < arr2.size() - 2; i++) {
                            arr1.add(arr2.get(i));
                        }
                    }
                    arr1.add(n1);
                    arr2 = new ArrayList<>();
                    flag=1;
                }
            } else if ("/".equals(s)) {
                if(flag==1){
                    n1  = arr1.get(arr1.size()-2);
                    n2  = arr1.get(arr1.size()-1);
                    n1 /= n2;
                    if(arr1.size()>2){
                        for (int i = 0; i < arr1.size() - 2; i++) {
                            arr2.add(arr1.get(i));
                        }
                    }
                    arr2.add(n1);
                    arr1 = new ArrayList<>();
                    flag=2;
                }
                else{
                    n1  = arr2.get(arr2.size()-2);
                    n2  = arr2.get(arr2.size()-1);
                    n1 /= n2;
                    if(arr2.size()>2){
                        for (int i = 0; i < arr2.size() - 2; i++) {
                            arr1.add(arr2.get(i));
                        }
                    }
                    arr1.add(n1);
                    arr2 = new ArrayList<>();
                    flag=1;
                }
            } else {
                boolean b = (flag==1)?arr1.add(Integer.parseInt(s)):arr2.add(Integer.parseInt(s));
            }
        }
        return n1;
    }
}
