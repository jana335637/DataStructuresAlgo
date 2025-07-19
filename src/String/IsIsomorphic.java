package String;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length() ) return false;
        Map<Character, Character> sMap = new HashMap<>(), tMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(sMap.containsKey(s.charAt(i))) {
                if(sMap.get(s.charAt(i)) != t.charAt(i)) return false;
            } else {
                if(tMap.containsKey(t.charAt(i))) return false;
                sMap.put(s.charAt(i), t.charAt(i));
                tMap.put(t.charAt(i), s.charAt(i));
            }
            //System.out.println(map);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsIsomorphic().isIsomorphic("bbbaaaba","aaabbbba"));
    }
    public boolean isIsomorphic1(String s, String t){
        if(s.length() != t.length() ) return false;
        Map<Character, Integer> sMap = new HashMap<>(), tMap = new HashMap<>();
        for(Character c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        for(Character c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(sMap.get(s.charAt(i)) != tMap.get(t.charAt(i))) return false;
        }
        return true;
    }
}
