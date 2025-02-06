package AUDevDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AlexKeyboard {
    public static void main(String[] args) {
       Scanner  in  = new Scanner(System.in);
       String word = in.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        if(word.length() == 0)
        System.out.println(0);
        else{
            int count=1;
            char[] chars = word.toCharArray();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < chars.length-1; i++) {
                if(chars[i] == chars[i+1]){
                    count++;
                } else {
                    if(count > 1) list.add(count);
                    count =1;
                }
            }
            if(count > 1) list.add(count);
            long ans = 1;
            for(Integer i : list){
                ans*=i;
                ans = ans % (1000000007);
            }
            System.out.println(ans);
        }
    }
}
