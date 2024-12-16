package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        if(strs.length > 0){
            map.put(strs[0], new ArrayList<>());
        };
        for (int i = 1; i < strs.length; i++) {
            boolean matched =false;
            for (String key : map.keySet()){
                if(isAnagram(key, strs[i])) {
                    map.get(key).add(strs[i]);
                    matched = true;
                    break;
                }
            }
            if(!matched) map.put(strs[i], new ArrayList<>());
        }
        for (String key : map.keySet()){
            ArrayList<String> array = new ArrayList<>();
            array.add(key);
            array.addAll(map.get(key));
            res.add(array);
        }
        return res;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < 26; i++) {
            arr1[i]=-1;
            arr2[i]=-1;
        }
        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i)-'a']++;
            arr2[t.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
