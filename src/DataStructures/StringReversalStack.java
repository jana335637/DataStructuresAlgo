package DataStructures;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by pillutja on 4/19/2018.
 */
public class StringReversalStack {
    public static void main(String[] args) {
        String name = "Raju";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < name.length() ; i++) {
            stack.push(name.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        Queue<Integer> queue = new PriorityQueue<>();
        System.out.println(((Integer)1).equals(1.0));
    }
}
