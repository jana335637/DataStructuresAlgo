package String;

public class Anagram {
    public static void main(String[] args) {

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
