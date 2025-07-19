package String;

public class ReverseWordsWithoutTrailingLeadingSpaces {
    public void reverseString(char[] s,int start, int end) {
        int l=start, r=end;
        while(l<r){
            char tmp = s[l];
            s[l]=s[r];
            s[r]=tmp;
            l++;r--;
        }
    }
    public String reverseWords(String s) {
        if(s.length()==0) return "";
        char[] chars = s.toCharArray();
        reverseString(chars,0,chars.length-1);
        int i=0, j=0,n = chars.length, start,end=0;
        while(j<n){
            while(j<n && chars[j]==' ') j++;
            start=i;
            while(j<n && chars[j] != ' '){
                chars[i]=chars[j];
                i++;
                j++;
            }
            end=i-1;
            reverseString(chars, start, end);
            if(j<n){
                chars[i]=' ';
                i++;
            }
        }
        return new String(chars).substring(0,end);
    }
}
