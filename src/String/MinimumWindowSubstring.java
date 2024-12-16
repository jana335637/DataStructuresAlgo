package String;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length()==0) return "";
        int[] hash = new int[256];
        for (int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }
        int n=s.length(), m=t.length(), count=0, l=0, r=0, sIndex=-1, minLen = Integer.MAX_VALUE;
        while(r<n){
            if(hash[s.charAt(r)] > 0) count++;
            hash[s.charAt(r)]--;
            while(count==m){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    sIndex=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0) count--;
                l++;
            }
            r++;
        }
        if(sIndex == -1) return "";
        else return s.substring(sIndex, sIndex+minLen+1);
    }

    public static void main(String[] args) {
        System.out.println('A');
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put('A'+i, 0);
            map.put('a'+i, 0);
        }
        System.out.println(map);
        System.out.println(map.size());
    }
}
