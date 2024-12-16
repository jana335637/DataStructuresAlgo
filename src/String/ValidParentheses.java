package String;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[{}]{"));
        System.out.println(isValid("()[{}]"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
                System.out.println(stack);
            }
            if(ch == ')' || ch == '}' || ch == ']'){
                if(!stack.isEmpty() && stack.peek() == map.get(ch)){
                    stack.pop();
                    System.out.println(stack);
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
