package AUDevDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SimilarStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Integer, List<Character>> map = new HashMap<>();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        for (int i = 1;i<=5; i++) {
            map.put(i, new ArrayList<>());
        }
        for (char i = 'a'; i <= 'z' ; i++) {
            int min = Integer.MAX_VALUE;
            for(char vowel : vowels) {
                min = Math.min(min, Math.abs(i - vowel));
            }
            if(min>0)
            map.get(min).add(i);
        }
        int consonants =0, vowelsCount = 0;
        Map<Character, Integer> consonantsMap = new HashMap<>();
        for(char c: s.toCharArray()){
            if(!vowels.contains(c)){
                consonants++;
                consonantsMap.put(c, consonantsMap.getOrDefault(c, 0) + 1);
            } else{
                vowelsCount++;
            }
        }
        int changesRequired = s.length()/2 - vowelsCount, ans=0;
        System.out.println(changesRequired + " map : "+ consonantsMap);
        while(changesRequired>0){
            Set<Character> consonantsSet = consonantsMap.keySet();
            for(Character c: consonantsSet){
                for (int i = 1; i <= 5; i++) {
                    //System.out.println("consonants: " + c + " int : " + i);
                    if(map.get(i).contains(c)){
                        if(changesRequired >= consonantsMap.get(c)){
                            changesRequired -= consonantsMap.get(c);
                            ans += (consonantsMap.get(c)*i);
                        } else{
                            ans += changesRequired*i;
                            changesRequired = 0;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
