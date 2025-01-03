package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapCases {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() == 0) return true;
        if(magazine.length() == 0 ) return false;
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
        System.out.println(magMap);
        System.out.println(ransomMap);
        for(Character ch: ransomMap.keySet()){
            if(magMap.get(ch) == null || magMap.get(ch)<ransomMap.get(ch))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }
}
