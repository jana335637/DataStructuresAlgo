package String;

public class longestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdaabdffffgabcdefght"));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int len=0, maxLen=0, l=0, r=0;
        int[]  arr = new int[256];
        for (int i = 0; i < 256; i++) {
            arr[i]=-1;
        }
        while (r < s.length()){
            if(arr[s.charAt(r)]!=-1){
                if(l <= arr[s.charAt(r)]){
                    System.out.println(s.charAt(r) + " is already found l, r "+ l +","+ r);
                    l = arr[s.charAt(r)]+1;
                    System.out.println("new l :" +l);

                }
            }
            arr[s.charAt(r)]=r;
            len = Math.max(len, r-l+1);
            r++;
        }
        return len;
    }
}
