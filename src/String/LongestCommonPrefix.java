package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 ) return  "";
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLen = Math.min(strs[i].length(), minLen);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i);
            boolean prefix = true;
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].charAt(i) != ch){
                    prefix = false;
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(ch);
        }
        return "";
    }

    public String longestCommonPrefixSort(String[] str) {
        //your code goes here
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        int minLen = Math.min(first.length(), last.length());
        int i=0;
        while(i<minLen && first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}
