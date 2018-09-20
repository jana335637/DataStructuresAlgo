package SI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by pillutja on 9/6/2018.
 */
public class FirstRepeatingCharacter {
    static Scanner in = new Scanner(System.in);
    static int ans = 0;
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            firstRepeatingChar();
        }
    }

    private static void firstRepeatingChar() {
        String s = in.next();
        int[] count = new int[26];
        int repeatingChar = Integer.MAX_VALUE;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c-'a']++;
            System.out.println("character:"+c+","+map.keySet().contains(c));
            if (!map.keySet().contains(c))
            {
                map.put(c,i);
            }
            if(count[c-'a']==2)
            {
                System.out.println(repeatingChar+", Char:"+c+",Map.get"+map.get(c));
                if(repeatingChar>map.get(c));
                    repeatingChar = map.get(c);
                System.out.println("After:"+repeatingChar);
            }
        }
        if(repeatingChar==Integer.MAX_VALUE)
            System.out.println(".");
        else
            System.out.println(s.charAt(repeatingChar));
    }

}
