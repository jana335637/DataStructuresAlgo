package Trees;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        if(s.length()==0) return 0;
        int l=0, r=0, maxFr=0, maxLen=Integer.MIN_VALUE;
        int[]  hash = new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxFr = Math.max(maxFr, hash[s.charAt(r)-'A']);
            if(r-l+1-maxFr > k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if(r-l+1 - maxFr <= k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
        }
        return maxLen;
    }

}
