package HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        Map<Character, String> patternmap =  new HashMap<>();
        Map<String, Character> sMap =  new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if(!patternmap.containsKey(pattern.charAt(i)) && !sMap.containsKey(strings[i])){
                patternmap.put(pattern.charAt(i), strings[i]);
                sMap.put( strings[i], pattern.charAt(i));
            }
            else {
                if(patternmap.get(pattern.charAt(i)) ==null || !patternmap.get(pattern.charAt(i)).equals(strings[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
