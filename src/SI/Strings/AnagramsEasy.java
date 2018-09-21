package SI.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by pillutja on 9/6/2018.
 */
public class AnagramsEasy {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int ans = 0;
    public static void main(String[] args) throws IOException {
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            System.out.println(isAnagram());;
        }
    }

    private static String isAnagram() throws  IOException {
        String s = br.readLine();
        String s1 = s.split(" ")[0];
        String s2 = s.split(" ")[1];
        if (s1.length() != s2.length())
            return "False";
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            count[c - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            count[c - 'a']--;
        }
        for (int i = 0; i < 26 ; i++) {
            if(count[i]!=0)
                return "False";
        }
        return "True";
    }
}
