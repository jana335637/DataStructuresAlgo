package HashMap;

import java.util.HashMap;
import java.util.Map;

public class StringIsometric {
    public boolean isIsomorphic(String ransomNote, String magazine) {
        if(ransomNote.length() != magazine.length()) return false;
        Map<Character, Integer> magMap = new HashMap<>();
        Map<Character, Integer> ransomMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            if(magMap.containsKey(magazine.charAt(i))){
                magMap.put(magazine.charAt(i), magMap.get(magazine.charAt(i))+1);
            } else {
                magMap.put(magazine.charAt(i), 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(ransomMap.containsKey(ransomNote.charAt(i))){
                ransomMap.put(ransomNote.charAt(i), ransomMap.get(ransomNote.charAt(i))+1);
            } else {
                ransomMap.put(ransomNote.charAt(i),1);
            }
        }
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            if(!map.containsKey(ransomNote.charAt(i))){
                map.put(ransomNote.charAt(i), magazine.charAt(i));
            } else {
                if(map.get(ransomNote.charAt(i)) != magazine.charAt(i))
                    return false;
            }
            if(ransomMap.get(ransomNote.charAt(i)) != magMap.get(magazine.charAt(i)))
                return false;
        }
        return true;
    }
}
