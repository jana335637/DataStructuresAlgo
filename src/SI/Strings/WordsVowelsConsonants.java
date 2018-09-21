package SI.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pillutja on 9/6/2018.
 */
public class WordsVowelsConsonants {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static Set<Character> set = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    public static void main(String[] args) throws IOException {
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            countWordsVowelsConsonants();
        }
    }

    private static void countWordsVowelsConsonants() throws  IOException {
        String s = br.readLine();
        int words=0,vowels=0,consonants=0;
        if(set.contains(s.charAt(0)))
            vowels++;
        else if(('a' <= s.charAt(0) && s.charAt(0) <= 'z') || ('A' <= s.charAt(0) && s.charAt(0) <= 'Z'))
            consonants++;
        for (int i = 1; i < s.length(); i++) {
            if(set.contains(s.charAt(i))){
                vowels++;
                if(s.charAt(i-1)==' ')
                    words++;
            }
            else if(('a' <= s.charAt(i) && s.charAt(i) <= 'z') || ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')){
                consonants++;
                if(s.charAt(i-1)==' ')
                    words++;
            }
        }
        if(s.charAt(0)!=' ')
            words++;
        System.out.println(words+" "+vowels+" "+consonants);
    }
}
