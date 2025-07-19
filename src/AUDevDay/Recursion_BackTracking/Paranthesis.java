package AUDevDay.Recursion_BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Paranthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String>  list = getParanthesis(n);
        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }

    private static List<String> getParanthesis(int n) {
        if(n==1){
            List<String> list = new ArrayList<>();
            list.add("()");
            return list;
        }
        return preparedList(getParanthesis(n-1));
    }

    private static List<String> preparedList(List<String> paranthesis) {
        List<String> newList = new ArrayList<>();
        for (String s : paranthesis) {
            newList.add("("+s+")");
        }
        int n = paranthesis.size();
        for (int i = 0; i < n-1; i++) {
            newList.add(paranthesis.get(i)+"()");
        }
        for (int i = 0; i < n-1; i++) {
            newList.add("()"+paranthesis.get(i));
        }
        newList.add(paranthesis.get(n-1)+"()");
        return newList;
    }

    public List<String> generateParenthesis(int n) {
        List<String>  list = getParanthesis(n);
        Collections.sort(list);
        return list;
    }
}
